
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.conorjohnnymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.conorjohnnymod.block.PigIronOreBlock;
import net.mcreator.conorjohnnymod.block.PigIronBlockBlock;
import net.mcreator.conorjohnnymod.ConorjohnnymodMod;

public class ConorjohnnymodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ConorjohnnymodMod.MODID);
	public static final RegistryObject<Block> PIG_IRON_BLOCK = REGISTRY.register("pig_iron_block", () -> new PigIronBlockBlock());
	public static final RegistryObject<Block> PIG_IRON_ORE = REGISTRY.register("pig_iron_ore", () -> new PigIronOreBlock());
}
