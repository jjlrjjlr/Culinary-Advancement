package jjlr.culinaryadvancement.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CAItemGroup {

    public static final ItemGroup initItemGroup = FabricItemGroupBuilder.build(
            new Identifier("culinary_advancement_itemgroup"), () -> new ItemStack(CraftedFood.APPLE_PIE_UNCOOKED));
    
}