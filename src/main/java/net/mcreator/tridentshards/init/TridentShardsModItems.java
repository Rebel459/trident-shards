
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tridentshards.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.tridentshards.item.TridentShardItem;
import net.mcreator.tridentshards.TridentShardsMod;

public class TridentShardsModItems {
	public static Item TRIDENT_SHARD;

	public static void load() {
		TRIDENT_SHARD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TridentShardsMod.MODID, "trident_shard"), new TridentShardItem());
	}
}
