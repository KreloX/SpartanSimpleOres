package krelox.spartansimpleores.init;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ItemTierSSO implements IItemTier {

	MYTHRIL(2, 800, 8.0F, 3.0F, 12, () -> {
		return null;
	}), ADAMANTIUM(2, 1150, 14.0F, 3.0F, 3, () -> {
		return null;
	}), ONYX(4, 3280, 10.0F, 5.0F, 15, () -> {
		return null;
	}), SINISITE(5, 4100, 18.0F, 8.0F, 11, () -> {
		return null;
	}), THYRIUM(3, 2000, 22.0F, 6.0F, 28, () -> {
		return null;
	}), STEEL(2, 700, 7.5F, 3.0F, 24, () -> {
		return null;
	}), ARGONITE(4, 1300, 8.0F, 3.0F, 18, () -> {
		return null;
	}), ASHSTONE(3, 900, 16.0F, 2.0F, 7, () -> {
		return null;
	}), DRAGONSTONE(4, 4000, 10.0F, 8.0F, 27, () -> {
		return null;
	}), FYRITE(3, 150, 8.0F, 4.0F, 7, () -> {
		return null;
	}), ILLUMENITE(3, 700, 8.0F, 4.0F, 7, () -> {
		return null;
	}), MALACHITE(3, 700, 9.0F, 3.0F, 39, () -> {
		return null;
	});

	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial;

	private ItemTierSSO(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn,
			int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
		this.harvestLevel = harvestLevelIn;
		this.maxUses = maxUsesIn;
		this.efficiency = efficiencyIn;
		this.attackDamage = attackDamageIn;
		this.enchantability = enchantabilityIn;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
	}

	@Override
	public int getUses() {
		return this.maxUses;
	}

	@Override
	public float getSpeed() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.attackDamage;
	}

	@Override
	public int getLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial.get();
	}
}
