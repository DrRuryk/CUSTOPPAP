
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.rcraft.block.LittlecokekerBlock;
import net.mcreator.rcraft.block.BetterFurnaceBlock;
import net.mcreator.rcraft.RcraftMod;

public class RcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RcraftMod.MODID);
	public static final RegistryObject<Block> BETTER_FURNACE = REGISTRY.register("better_furnace", () -> new BetterFurnaceBlock());
	public static final RegistryObject<Block> LITTLECOKEKER = REGISTRY.register("littlecokeker", () -> new LittlecokekerBlock());
}
