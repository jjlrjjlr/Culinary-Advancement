package jjlr.culinaryadvancement.items.ItemTypes;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class foodShouldCook extends Item {

    public foodShouldCook(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack_1, World worldIn, List<Text> toolTip, TooltipContext tooltipContext_1) {
        toolTip.add(new TranslatableText("tooltip.culinaryadvancement.canbeeatenraw_line1").formatted(Formatting.DARK_GREEN));
        toolTip.add(new TranslatableText("tooltip.culinaryadvancement.canbeeatenraw_line2").formatted(Formatting.DARK_GREEN));
        toolTip.add(new TranslatableText("tooltip.culinaryadvancement.canbeeatenraw_line3").formatted(Formatting.DARK_GREEN));
    }
}