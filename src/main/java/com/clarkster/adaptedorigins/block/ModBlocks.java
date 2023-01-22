package com.clarkster.adaptedorigins.block;

import com.clarkster.adaptedorigins.AdaptedOriginsMod;
import com.clarkster.adaptedorigins.block.custom.SoulPumpkin;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block SOUL_PUMPKIN = registerBlock("soul_pumpkin",
            new SoulPumpkin(FabricBlockSettings.of(Material.GOURD).strength(1f)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(AdaptedOriginsMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(AdaptedOriginsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        AdaptedOriginsMod.LOGGER.debug("Registering mods for " + AdaptedOriginsMod.MOD_ID);
    }
}
