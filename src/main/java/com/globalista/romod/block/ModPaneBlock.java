package com.globalista.romod.block;

import com.globalista.romod.RoMod;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PaneBlock;
import net.minecraft.client.render.RenderLayer;

public class ModPaneBlock extends PaneBlock {

    protected ModPaneBlock(Settings settings) {
        super(settings);
    }
}
