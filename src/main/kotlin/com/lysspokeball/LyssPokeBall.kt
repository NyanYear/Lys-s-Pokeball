package com.lysspokeball

import com.lysspokeball.block.ModBlock
import com.lysspokeball.item.ModItem
import com.lysspokeball.item.ModItemGroup
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object LyssPokeBall : ModInitializer {
	const val MOD_ID = "lysspokeball"
	private val logger = LoggerFactory.getLogger("lyss-pokeball")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
		ModItem.registerModItems()
		ModItemGroup.registerItemGroups()
		ModBlock.registerModBlocks()
	}
}