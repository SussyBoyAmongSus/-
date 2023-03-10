
package net.mcreator.conorjohnnymod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class PigIronPickaxeItem extends PickaxeItem {
	public PigIronPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 441;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ConorjohnnymodModItems.DELETED_MOD_ELEMENT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}