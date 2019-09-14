package jjlr.culinaryadvancement.items;

import jjlr.culinaryadvancement.Main;
import jjlr.culinaryadvancement.items.ItemTypes.foodShouldCook;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftedFood {

    public static final foodShouldCook APPLE_PIE_UNCOOKED = new foodShouldCook(
            new Item.Settings().group(CAItemGroup.initItemGroup)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build()));
    public static final Item CHICKEN_SOUP = new Item(new Item.Settings().group(CAItemGroup.initItemGroup)
            .food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 2400, 0), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 240, 0), 0.95f).build()).maxCount(4));
    public static final ChorusCake CHORUS_CAKE = new ChorusCake(new Item.Settings().group(CAItemGroup.initItemGroup)
            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).alwaysEdible().build()).maxCount(8));
    public static final Item GOLDEN_CARROT_CAKE = new Item(new Item.Settings().group(CAItemGroup.initItemGroup)
            .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0), 1.0f).build()));
    public static final foodShouldCook WHEAT_DOUGH = new foodShouldCook(
            new Item.Settings().group(CAItemGroup.initItemGroup)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build()));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(Main.MODID, "apple_pie_uncooked"), APPLE_PIE_UNCOOKED);
        Registry.register(Registry.ITEM, new Identifier(Main.MODID, "chicken_soup"), CHICKEN_SOUP);
        Registry.register(Registry.ITEM, new Identifier(Main.MODID, "chorus_cake"), CHORUS_CAKE);
        Registry.register(Registry.ITEM, new Identifier(Main.MODID, "golden_carrot_cake"), GOLDEN_CARROT_CAKE);
        Registry.register(Registry.ITEM, new Identifier(Main.MODID, "wheat_dough"), WHEAT_DOUGH);
    }
}