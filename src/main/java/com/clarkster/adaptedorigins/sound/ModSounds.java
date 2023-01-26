package com.clarkster.adaptedorigins.sound;

import com.clarkster.adaptedorigins.AdaptedOriginsMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static SoundEvent PHOENIX_CALL = registerSoundEvent("phoenix_call");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(AdaptedOriginsMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
