
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.conorjohnnymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.conorjohnnymod.item.JknItem;
import net.mcreator.conorjohnnymod.ConorjohnnymodMod;

public class ConorjohnnymodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ConorjohnnymodMod.MODID);
	public static final RegistryObject<Item> JKN = REGISTRY.register("jkn", () -> new JknItem());
}
