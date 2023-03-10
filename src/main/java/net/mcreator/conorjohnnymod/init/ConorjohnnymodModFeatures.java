
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.conorjohnnymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.conorjohnnymod.world.features.ores.PigIronOreFeature;
import net.mcreator.conorjohnnymod.ConorjohnnymodMod;

@Mod.EventBusSubscriber
public class ConorjohnnymodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ConorjohnnymodMod.MODID);
	public static final RegistryObject<Feature<?>> PIG_IRON_ORE = REGISTRY.register("pig_iron_ore", PigIronOreFeature::feature);
}
