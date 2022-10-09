package krelox.spartansimpleores.init;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;

import krelox.spartansimpleores.SpartanSimpleOres;
import krelox.spartansimpleores.itemgroup.ItemGroupSSO;
import mod.alexndr.simpleores.content.SimpleOresItemTier;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistrySSO 
{	
	//SimpleOres
	public static WeaponMaterial MYTHRIL = new WeaponMaterial("mythril", SimpleOresItemTier.MYTHRIL, new ResourceLocation("forge:ingots/mithril"));
    public static WeaponMaterial ADAMANTIUM = new WeaponMaterial("adamantium", SimpleOresItemTier.ADAMANTIUM, new ResourceLocation("forge:ingots/adamantium"));
    public static WeaponMaterial ONYX = new WeaponMaterial("onyx", SimpleOresItemTier.ONYX, new ResourceLocation("forge:gems/onyx"));

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpartanSimpleOres.MODID);
	
    public static final RegistryObject<Item> DAGGER_MYTHRIL = ITEMS.register("dagger_mythril", () -> SpartanWeaponryAPI.createDagger(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> DAGGER_ADAMANTIUM = ITEMS.register("dagger_adamantium", () -> SpartanWeaponryAPI.createDagger(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> DAGGER_ONYX = ITEMS.register("dagger_onyx", () -> SpartanWeaponryAPI.createDagger(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> LONGSWORD_MYTHRIL = ITEMS.register("longsword_mythril", () -> SpartanWeaponryAPI.createLongsword(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGSWORD_ADAMANTIUM = ITEMS.register("longsword_adamantium", () -> SpartanWeaponryAPI.createLongsword(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGSWORD_ONYX = ITEMS.register("longsword_onyx", () -> SpartanWeaponryAPI.createLongsword(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> KATANA_MYTHRIL = ITEMS.register("katana_mythril", () -> SpartanWeaponryAPI.createKatana(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> KATANA_ADAMANTIUM = ITEMS.register("katana_adamantium", () -> SpartanWeaponryAPI.createKatana(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> KATANA_ONYX = ITEMS.register("katana_onyx", () -> SpartanWeaponryAPI.createKatana(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> SABER_MYTHRIL = ITEMS.register("saber_mythril", () -> SpartanWeaponryAPI.createSaber(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SABER_ADAMANTIUM = ITEMS.register("saber_adamantium", () -> SpartanWeaponryAPI.createSaber(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SABER_ONYX = ITEMS.register("saber_onyx", () -> SpartanWeaponryAPI.createSaber(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> RAPIER_MYTHRIL = ITEMS.register("rapier_mythril", () -> SpartanWeaponryAPI.createRapier(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> RAPIER_ADAMANTIUM = ITEMS.register("rapier_adamantium", () -> SpartanWeaponryAPI.createRapier(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> RAPIER_ONYX = ITEMS.register("rapier_onyx", () -> SpartanWeaponryAPI.createRapier(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> GREATSWORD_MYTHRIL = ITEMS.register("greatsword_mythril", () -> SpartanWeaponryAPI.createGreatsword(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GREATSWORD_ADAMANTIUM = ITEMS.register("greatsword_adamantium", () -> SpartanWeaponryAPI.createGreatsword(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GREATSWORD_ONYX = ITEMS.register("greatsword_onyx", () -> SpartanWeaponryAPI.createGreatsword(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> HAMMER_MYTHRIL = ITEMS.register("hammer_mythril", () -> SpartanWeaponryAPI.createBattleHammer(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HAMMER_ADAMANTIUM = ITEMS.register("hammer_adamantium", () -> SpartanWeaponryAPI.createBattleHammer(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HAMMER_ONYX = ITEMS.register("hammer_onyx", () -> SpartanWeaponryAPI.createBattleHammer(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> WARHAMMER_MYTHRIL = ITEMS.register("warhammer_mythril", () -> SpartanWeaponryAPI.createWarhammer(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> WARHAMMER_ADAMANTIUM = ITEMS.register("warhammer_adamantium", () -> SpartanWeaponryAPI.createWarhammer(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> WARHAMMER_ONYX = ITEMS.register("warhammer_onyx", () -> SpartanWeaponryAPI.createWarhammer(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> SPEAR_MYTHRIL = ITEMS.register("spear_mythril", () -> SpartanWeaponryAPI.createSpear(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SPEAR_ADAMANTIUM = ITEMS.register("spear_adamantium", () -> SpartanWeaponryAPI.createSpear(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SPEAR_ONYX = ITEMS.register("spear_onyx", () -> SpartanWeaponryAPI.createSpear(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> HALBERD_MYTHRIL = ITEMS.register("halberd_mythril", () -> SpartanWeaponryAPI.createHalberd(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HALBERD_ADAMANTIUM = ITEMS.register("halberd_adamantium", () -> SpartanWeaponryAPI.createHalberd(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HALBERD_ONYX = ITEMS.register("halberd_onyx", () -> SpartanWeaponryAPI.createHalberd(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> PIKE_MYTHRIL = ITEMS.register("pike_mythril", () -> SpartanWeaponryAPI.createPike(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PIKE_ADAMANTIUM = ITEMS.register("pike_adamantium", () -> SpartanWeaponryAPI.createPike(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PIKE_ONYX = ITEMS.register("pike_onyx", () -> SpartanWeaponryAPI.createPike(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> LANCE_MYTHRIL = ITEMS.register("lance_mythril", () -> SpartanWeaponryAPI.createLance(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LANCE_ADAMANTIUM = ITEMS.register("lance_adamantium", () -> SpartanWeaponryAPI.createLance(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LANCE_ONYX = ITEMS.register("lance_onyx", () -> SpartanWeaponryAPI.createLance(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> LONGBOW_MYTHRIL = ITEMS.register("longbow_mythril", () -> SpartanWeaponryAPI.createLongbow(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGBOW_ADAMANTIUM = ITEMS.register("longbow_adamantium", () -> SpartanWeaponryAPI.createLongbow(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGBOW_ONYX = ITEMS.register("longbow_onyx", () -> SpartanWeaponryAPI.createLongbow(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> CROSSBOW_MYTHRIL = ITEMS.register("heavy_crossbow_mythril", () -> SpartanWeaponryAPI.createHeavyCrossbow(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> CROSSBOW_ADAMANTIUM = ITEMS.register("heavy_crossbow_adamantium", () -> SpartanWeaponryAPI.createHeavyCrossbow(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> CROSSBOW_ONYX = ITEMS.register("heavy_crossbow_onyx", () -> SpartanWeaponryAPI.createHeavyCrossbow(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> THROWING_KNIFE_MYTHRIL = ITEMS.register("throwing_knife_mythril", () -> SpartanWeaponryAPI.createThrowingKnife(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> THROWING_KNIFE_ADAMANTIUM = ITEMS.register("throwing_knife_adamantium", () -> SpartanWeaponryAPI.createThrowingKnife(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> THROWING_KNIFE_ONYX = ITEMS.register("throwing_knife_onyx", () -> SpartanWeaponryAPI.createThrowingKnife(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> TOMAHAWK_MYTHRIL = ITEMS.register("tomahawk_mythril", () -> SpartanWeaponryAPI.createTomahawk(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> TOMAHAWK_ADAMANTIUM = ITEMS.register("tomahawk_adamantium", () -> SpartanWeaponryAPI.createTomahawk(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> TOMAHAWK_ONYX = ITEMS.register("tomahawk_onyx", () -> SpartanWeaponryAPI.createTomahawk(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> JAVELIN_MYTHRIL = ITEMS.register("javelin_mythril", () -> SpartanWeaponryAPI.createJavelin(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> JAVELIN_ADAMANTIUM = ITEMS.register("javelin_adamantium", () -> SpartanWeaponryAPI.createJavelin(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> JAVELIN_ONYX = ITEMS.register("javelin_onyx", () -> SpartanWeaponryAPI.createJavelin(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> BOOMERANG_MYTHRIL = ITEMS.register("boomerang_mythril", () -> SpartanWeaponryAPI.createBoomerang(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BOOMERANG_ADAMANTIUM = ITEMS.register("boomerang_adamantium", () -> SpartanWeaponryAPI.createBoomerang(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BOOMERANG_ONYX = ITEMS.register("boomerang_onyx", () -> SpartanWeaponryAPI.createBoomerang(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> BATTLEAXE_MYTHRIL = ITEMS.register("battleaxe_mythril", () -> SpartanWeaponryAPI.createBattleaxe(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BATTLEAXE_ADAMANTIUM = ITEMS.register("battleaxe_adamantium", () -> SpartanWeaponryAPI.createBattleaxe(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BATTLEAXE_ONYX = ITEMS.register("battleaxe_onyx", () -> SpartanWeaponryAPI.createBattleaxe(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> MACE_MYTHRIL = ITEMS.register("flanged_mace_mythril", () -> SpartanWeaponryAPI.createFlangedMace(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> MACE_ADAMANTIUM = ITEMS.register("flanged_mace_adamantium", () -> SpartanWeaponryAPI.createFlangedMace(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> MACE_ONYX = ITEMS.register("flanged_mace_onyx", () -> SpartanWeaponryAPI.createFlangedMace(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> GLAIVE_MYTHRIL = ITEMS.register("glaive_mythril", () -> SpartanWeaponryAPI.createGlaive(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GLAIVE_ADAMANTIUM = ITEMS.register("glaive_adamantium", () -> SpartanWeaponryAPI.createGlaive(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GLAIVE_ONYX = ITEMS.register("glaive_onyx", () -> SpartanWeaponryAPI.createGlaive(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> QUARTERSTAFF_MYTHRIL = ITEMS.register("quarterstaff_mythril", () -> SpartanWeaponryAPI.createQuarterstaff(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> QUARTERSTAFF_ADAMANTIUM = ITEMS.register("quarterstaff_adamantium", () -> SpartanWeaponryAPI.createQuarterstaff(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> QUARTERSTAFF_ONYX = ITEMS.register("quarterstaff_onyx", () -> SpartanWeaponryAPI.createQuarterstaff(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> SCYTHE_MYTHRIL = ITEMS.register("scythe_mythril", () -> SpartanWeaponryAPI.createScythe(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SCYTHE_ADAMANTIUM = ITEMS.register("scythe_adamantium", () -> SpartanWeaponryAPI.createScythe(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SCYTHE_ONYX = ITEMS.register("scythe_onyx", () -> SpartanWeaponryAPI.createScythe(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> PARRYING_DAGGER_MYTHRIL = ITEMS.register("parrying_dagger_mythril", () -> SpartanWeaponryAPI.createParryingDagger(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_ADAMANTIUM = ITEMS.register("parrying_dagger_adamantium", () -> SpartanWeaponryAPI.createParryingDagger(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_ONYX = ITEMS.register("parrying_dagger_onyx", () -> SpartanWeaponryAPI.createParryingDagger(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));
}
