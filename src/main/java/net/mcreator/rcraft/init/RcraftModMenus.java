
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.rcraft.world.inventory.BetterfurMenu;
import net.mcreator.rcraft.RcraftMod;

public class RcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RcraftMod.MODID);
	public static final RegistryObject<MenuType<BetterfurMenu>> BETTERFUR = REGISTRY.register("betterfur", () -> IForgeMenuType.create(BetterfurMenu::new));
}
