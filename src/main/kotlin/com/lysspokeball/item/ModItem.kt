package com.lysspokeball.item

import com.lysspokeball.LyssPokeBall
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItem {
    val POKE_BALL: Item = registerItem("poke_ball", Item(FabricItemSettings()))

    private fun registerItem(name: String, item: Item): Item {
        return Registry.register(Registries.ITEM, Identifier(LyssPokeBall.MOD_ID,name),item)
    }

    fun registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
            .register(ModItem::addItemsToIngredientItemGroup)
    }

    private fun addItemsToIngredientItemGroup(entries: FabricItemGroupEntries){
        entries.add(POKE_BALL)
    }
}