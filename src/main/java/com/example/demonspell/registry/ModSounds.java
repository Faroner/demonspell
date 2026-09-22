package com.example.demonspell.registry;

import com.example.demonspell.DemonSpellMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public final class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DemonSpellMod.MODID);

    public static final Supplier<SoundEvent> DEMON_TRANSFORMATION =
            SOUNDS.register("demon_transformation",
                    () -> SoundEvent.createVariableRangeEvent(
                            new ResourceLocation(DemonSpellMod.MODID, "demon_transformation")));

    private ModSounds() {}
}
