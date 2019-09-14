package jjlr.culinaryadvancement.items;

import jjlr.culinaryadvancement.Main;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SmeltedFood {
    public static final Item APPLE_PIE = new Item(new Item.Settings().group(CAItemGroup.initItemGroup)
            .food(new FoodComponent.Builder().hunger(7).saturationModifier(0.4f).build()));

    public static void registerItems() {
        
        Registry.register(Registry.ITEM, new Identifier(Main.MODID, "apple_pie"), APPLE_PIE);
    }
}