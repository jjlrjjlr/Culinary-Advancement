package jjlr.culinaryadvancement.items;

import jjlr.culinaryadvancement.Main;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class IngredientItems{

    public static final Item TEA_LEAF = new Item(new Item.Settings().group(CAItemGroup.initItemGroup).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.0f).build()));

    public static void registerItems(){
        
        Registry.register(Registry.ITEM, new Identifier(Main.MODID,"tea_leaf"), TEA_LEAF);
    }
}