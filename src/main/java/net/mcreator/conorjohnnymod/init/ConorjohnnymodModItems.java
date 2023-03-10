
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.conorjohnnymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.conorjohnnymod.item.PigIronSwordItem;
import net.mcreator.conorjohnnymod.item.PigIronShovelItem;
import net.mcreator.conorjohnnymod.item.PigIronPickaxeItem;
import net.mcreator.conorjohnnymod.item.PigIronIngotItem;
import net.mcreator.conorjohnnymod.item.PigIronHoeItem;
import net.mcreator.conorjohnnymod.item.PigIronAxeItem;
import net.mcreator.conorjohnnymod.item.PigIronArmorItem;
import net.mcreator.conorjohnnymod.ConorjohnnymodMod;

public class ConorjohnnymodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ConorjohnnymodMod.MODID);
	public static final RegistryObject<Item> PIG_IRON_BLOCK = block(ConorjohnnymodModBlocks.PIG_IRON_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PIG_IRON_ORE = block(ConorjohnnymodModBlocks.PIG_IRON_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PIG_IRON_SHOVEL = REGISTRY.register("pig_iron_shovel", () -> new PigIronShovelItem());
	public static final RegistryObject<Item> PIG_IRON_AXE = REGISTRY.register("pig_iron_axe", () -> new PigIronAxeItem());
	public static final RegistryObject<Item> PIG_IRON_ARMOR_HELMET = REGISTRY.register("pig_iron_armor_helmet", () -> new PigIronArmorItem.Helmet());
	public static final RegistryObject<Item> PIG_IRON_ARMOR_CHESTPLATE = REGISTRY.register("pig_iron_armor_chestplate", () -> new PigIronArmorItem.Chestplate());
	public static final RegistryObject<Item> PIG_IRON_ARMOR_LEGGINGS = REGISTRY.register("pig_iron_armor_leggings", () -> new PigIronArmorItem.Leggings());
	public static final RegistryObject<Item> PIG_IRON_ARMOR_BOOTS = REGISTRY.register("pig_iron_armor_boots", () -> new PigIronArmorItem.Boots());
	public static final RegistryObject<Item> PIG_IRON_PICKAXE = REGISTRY.register("pig_iron_pickaxe", () -> new PigIronPickaxeItem());
	public static final RegistryObject<Item> PIG_IRON_HOE = REGISTRY.register("pig_iron_hoe", () -> new PigIronHoeItem());
	public static final RegistryObject<Item> PIG_IRON_INGOT = REGISTRY.register("pig_iron_ingot", () -> new PigIronIngotItem());
	public static final RegistryObject<Item> PIG_IRON_SWORD = REGISTRY.register("pig_iron_sword", () -> new PigIronSwordItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
