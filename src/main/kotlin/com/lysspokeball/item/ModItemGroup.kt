package com.lysspokeball.item

import com.lysspokeball.LyssPokeBall
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import kotlin.contracts.Returns

object ModItemGroup {
    val POKEBALL_GROUP:ItemGroup = Registry.register(Registries.ITEM_GROUP,
        Identifier(LyssPokeBall.MOD_ID,"pokeball_group"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pokeballgroup"))
            .icon(fun(): ItemStack{return ItemStack(ModItem.POKE_BALL)})
            .entries(fun(displayContext: ItemGroup.DisplayContext,entries){

                entries.add(ModItem.POKE_BALL)

            }).build())
    fun registerItemGroups(){

    }
}