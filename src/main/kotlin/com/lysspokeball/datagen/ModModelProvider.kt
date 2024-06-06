package com.lysspokeball.datagen

import com.lysspokeball.block.ModBlock
import com.lysspokeball.item.ModItem
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models

class ModModelProvider(output: FabricDataOutput?) : FabricModelProvider(output) {


    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator?) {
        blockStateModelGenerator?.registerCubeAllModelTexturePool(ModBlock.POKE_BALL_BLOCK)
    }

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator?) {
        itemModelGenerator?.register(ModItem.POKE_BALL,Models.GENERATED);
    }
}