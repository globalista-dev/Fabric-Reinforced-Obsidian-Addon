package com.globalista.romod.block;

import com.globalista.romod.RoMod;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;

import static com.globalista.romod.block.BlockRegister.registerBlock;

public class ModBlocks {

    public static void callBlocks() {
        BlockRenderLayerMap.INSTANCE.putBlock(DARK_IRON_BARS, RenderLayer.getCutout());
        System.out.println("Registering RoMod blocks");
    }

    public static final Block REINFORCED_OBSIDIAN = registerBlock("reinforced_obsidian",
            new Block(FabricBlockSettings.of(Material.STONE).strength(50.0f, 3600000.0f).requiresTool()), RoMod.ROGROUP);

    public static final Block REINFORCED_OBSIDIAN_SLAB = registerBlock("reinforced_obsidian_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(50.0f,3600000.0f).requiresTool()), RoMod.ROGROUP);

    public static final Block REINFORCED_OBSIDIAN_WALL = registerBlock("reinforced_obsidian_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(50.0f,3600000.0f).requiresTool()), RoMod.ROGROUP);

    public static final Block REINFORCED_OBSIDIAN_STAIRS = registerBlock("reinforced_obsidian_stairs",
            new ModStairsBlock(ModBlocks.REINFORCED_OBSIDIAN.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(50.0f,3600000.0f).requiresTool()), RoMod.ROGROUP);

    public static final Block DARK_IRON_BLOCK = registerBlock("dark_iron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(10.5f, 139.3f).requiresTool().sounds(BlockSoundGroup.METAL)), RoMod.ROGROUP);

    public static final Block DARK_IRON_BARS = registerBlock("dark_iron_bars",
            new ModPaneBlock(FabricBlockSettings.of(Material.METAL).strength(7.0f, 92.8f).requiresTool().nonOpaque().sounds(BlockSoundGroup.METAL)), RoMod.ROGROUP);

}
