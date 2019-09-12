package jjlr.culinaryadvancement.items;

import jjlr.culinaryadvancement.items.ItemTypes.foodShouldCook;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftedFood{
    
    public static final foodShouldCook APPLE_PIE_UNCOOKED = new foodShouldCook(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build()));
    public static final foodShouldCook WHEAT_DOUGH = new foodShouldCook(new Item.Settings().group(CAItemGroup.initItemGroup).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));

    public static void registerItems(){

        Registry.register(Registry.ITEM, new Identifier("apple_pie_uncooked"), APPLE_PIE_UNCOOKED);
        Registry.register(Registry.ITEM, new Identifier("wheat_dough"), WHEAT_DOUGH);
    }
}