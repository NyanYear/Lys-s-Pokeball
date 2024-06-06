package com.lysspokeball.datagen

import com.lysspokeball.block.ModBlock
import com.lysspokeball.item.ModItem
import com.lysspokeball.item.ModItemGroup
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider

class ModLanguageProvider(dataOutput: FabricDataOutput?) : FabricLanguageProvider(dataOutput) {


    override fun generateTranslations(translationBuilder: TranslationBuilder?) {
        translationBuilder?.add(ModItem.POKE_BALL,"Poke ball")
        translationBuilder?.add(ModBlock.POKE_BALL_BLOCK,"Poke ball block")
    }
}