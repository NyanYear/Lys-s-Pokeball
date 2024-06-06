package com.lysspokeball

import com.lysspokeball.datagen.ModLanguageProvider
import com.lysspokeball.datagen.ModModelProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput

object LyssPokeBallDataGenerator : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack = fabricDataGenerator.createPack()


		pack.addProvider { output: FabricDataOutput? ->
			ModModelProvider(
				output
			)
		}
		pack.addProvider { output: FabricDataOutput? ->
			ModLanguageProvider(
				output
			)
		}
	}
}