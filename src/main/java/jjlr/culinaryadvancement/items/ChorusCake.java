package jjlr.culinaryadvancement.items;
 import java.util.List;

import net.minecraft.client.item.TooltipContext;
/**
  * 
  */
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;

public class ChorusCake extends Item {

    public ChorusCake(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack itemStackIn, World worldIn, LivingEntity livingEntityIn) {
        if (!worldIn.isClient){
            final Heightmap.Type heightmap = Heightmap.Type.MOTION_BLOCKING_NO_LEAVES;
            final BlockPos surface = worldIn.getTopPosition(heightmap, livingEntityIn.getBlockPos());
            final double surfaceX = (double) surface.getX();
            final double surfaceY = (double) surface.getY();
            final double surfaceZ = (double) surface.getZ();
            if (livingEntityIn.hasVehicle()){
                livingEntityIn.stopRiding();
            }
            livingEntityIn.teleport(surfaceX, surfaceY, surfaceZ);
        }
        return super.finishUsing(itemStackIn, worldIn, livingEntityIn);
    }

    @Override
    public void appendTooltip(ItemStack itemStackIn, World worldIn, List<Text> listIn, TooltipContext tooltipContext_1) {
        listIn.add(new TranslatableText("tooltip.culinaryadvancement.chorus_cake1"));
        listIn.add(new TranslatableText("tooltip.culinaryadvancement.chorus_cake2"));
    }
}