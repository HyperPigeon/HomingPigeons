package net.hyper_pigeon.homing_pigeons.register;


import net.hyper_pigeon.homing_pigeons.Constants;
import net.hyper_pigeon.homing_pigeons.platform.Services;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public final class SoundRegistry {
    public static void init() {}

    private static <T extends SoundEvent> Supplier<T> registerSound(String id, Supplier<T> sound) {
        return Services.PLATFORM.registerSound(id, sound);
    }
}
