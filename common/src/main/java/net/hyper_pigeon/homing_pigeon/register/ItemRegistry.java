package net.hyper_pigeon.homing_pigeons.register;

import net.hyper_pigeon.homing_pigeons.Constants;
import net.hyper_pigeon.homing_pigeons.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public final class ItemRegistry {
    public static final Supplier<CreativeModeTab> homing_pigeons_TAB = Services.PLATFORM.registerCreativeModeTab("homing_pigeons_items", () -> Services.PLATFORM.newCreativeTabBuilder()
            .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".homing_pigeons_items"))
            .icon(() -> new ItemStack(Items.EGG))
            .displayItems((enabledFeatures, entries) -> {
            })
            .build());

    public static void init(){

    }

    private static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item) {
        return Services.PLATFORM.registerItem(id, item);
    }
}
