package com.lysspokeball.block

import com.lysspokeball.LyssPokeBall
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier

object ModBlock {
    val POKE_BALL_BLOCK: Block = registerBlock(
        "poke_ball_block",
        Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK))
    )

    private fun registerBlock(name: String,block: Block): Block {
        registerModBlocksItem(name, block)
        return Registry.register(Registries.BLOCK, Identifier(LyssPokeBall.MOD_ID, name), block)
    }

    private fun registerModBlocksItem(name: String,block: Block): Item?{
        return Registry.register(
            Registries.ITEM,Identifier(LyssPokeBall.MOD_ID, name),
            BlockItem(block,FabricItemSettings())
        )
    }

    fun registerModBlocks(){

    }
}