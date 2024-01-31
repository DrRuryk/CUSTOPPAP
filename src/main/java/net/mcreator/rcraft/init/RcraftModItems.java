
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rcraft.RcraftMod;

public class RcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RcraftMod.MODID);
	public static final RegistryObject<Item> BETTER_FURNACE = block(RcraftModBlocks.BETTER_FURNACE);
	public static final RegistryObject<Item> LITTLECOKEKER = block(RcraftModBlocks.LITTLECOKEKER);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
