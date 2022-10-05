package krelox.spartansimpleores.init;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.WeaponMaterial;

import krelox.spartansimpleores.SpartanSimpleOres;
import krelox.spartansimpleores.itemgroup.ItemGroupSSO;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistrySSO 
{
	//SimpleOres
	public static WeaponMaterial MYTHRIL = new WeaponMaterial("mythril", ItemTierSSO.MYTHRIL, new ResourceLocation("forge:ingots/mithril"));
    public static WeaponMaterial ADAMANTIUM = new WeaponMaterial("adamantium", ItemTierSSO.ADAMANTIUM, new ResourceLocation("forge:ingots/adamantium"));
    public static WeaponMaterial ONYX = new WeaponMaterial("onyx", ItemTierSSO.ONYX, new ResourceLocation("forge:gems/onyx"));
    //Fusion
	public static WeaponMaterial SINISITE = new WeaponMaterial("sinisite", ItemTierSSO.SINISITE, new ResourceLocation("forge:ingots/sinisite"));
    public static WeaponMaterial THYRIUM = new WeaponMaterial("thyrium", ItemTierSSO.THYRIUM, new ResourceLocation("forge:ingots/thyrium"));
    //Netherrocks
	public static WeaponMaterial ARGONITE = new WeaponMaterial("argonite", ItemTierSSO.ARGONITE, new ResourceLocation("forge:ingots/argonite"));
    public static WeaponMaterial ASHSTONE = new WeaponMaterial("ashstone", ItemTierSSO.ASHSTONE, new ResourceLocation("forge:gems/ashstone"));
    public static WeaponMaterial DRAGONSTONE = new WeaponMaterial("dragonstone", ItemTierSSO.DRAGONSTONE, new ResourceLocation("forge:gems/dragonstone"));
	public static WeaponMaterial FYRITE = new WeaponMaterial("fyrite", ItemTierSSO.FYRITE, new ResourceLocation("forge:ingots/fyrite"));
    public static WeaponMaterial ILLUMENITE = new WeaponMaterial("illumenite", ItemTierSSO.ILLUMENITE, new ResourceLocation("forge:ingots/illumenite"));
    public static WeaponMaterial MALACHITE = new WeaponMaterial("malachite", ItemTierSSO.MALACHITE, new ResourceLocation("forge:ingots/malachite"));
    
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpartanSimpleOres.MODID);
	
    public static final RegistryObject<Item> DAGGER_MYTHRIL = ITEMS.register("dagger_mythril", () -> SpartanWeaponryAPI.createDagger(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> DAGGER_ADAMANTIUM = ITEMS.register("dagger_adamantium", () -> SpartanWeaponryAPI.createDagger(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> DAGGER_ONYX = ITEMS.register("dagger_onyx", () -> SpartanWeaponryAPI.createDagger(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> DAGGER_SINISITE = ITEMS.register("dagger_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> DAGGER_THYRIUM = ITEMS.register("dagger_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> DAGGER_ARGONITE = ITEMS.register("dagger_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> DAGGER_ASHSTONE = ITEMS.register("dagger_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> DAGGER_DRAGONSTONE = ITEMS.register("dagger_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> DAGGER_FYRITE = ITEMS.register("dagger_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> DAGGER_ILLUMENITE = ITEMS.register("dagger_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> DAGGER_MALACHITE = ITEMS.register("dagger_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
	public static final RegistryObject<Item> LONGSWORD_MYTHRIL = ITEMS.register("longsword_mythril", () -> SpartanWeaponryAPI.createLongsword(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGSWORD_ADAMANTIUM = ITEMS.register("longsword_adamantium", () -> SpartanWeaponryAPI.createLongsword(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGSWORD_ONYX = ITEMS.register("longsword_onyx", () -> SpartanWeaponryAPI.createLongsword(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> LONGSWORD_SINISITE = ITEMS.register("longsword_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGSWORD_THYRIUM = ITEMS.register("longsword_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> LONGSWORD_ARGONITE = ITEMS.register("longsword_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGSWORD_ASHSTONE = ITEMS.register("longsword_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> LONGSWORD_DRAGONSTONE = ITEMS.register("longsword_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGSWORD_FYRITE = ITEMS.register("longsword_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> LONGSWORD_ILLUMENITE = ITEMS.register("longsword_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGSWORD_MALACHITE = ITEMS.register("longsword_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> KATANA_MYTHRIL = ITEMS.register("katana_mythril", () -> SpartanWeaponryAPI.createKatana(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> KATANA_ADAMANTIUM = ITEMS.register("katana_adamantium", () -> SpartanWeaponryAPI.createKatana(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> KATANA_ONYX = ITEMS.register("katana_onyx", () -> SpartanWeaponryAPI.createKatana(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> KATANA_SINISITE = ITEMS.register("katana_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> KATANA_THYRIUM = ITEMS.register("katana_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> KATANA_ARGONITE = ITEMS.register("katana_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> KATANA_ASHSTONE = ITEMS.register("katana_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> KATANA_DRAGONSTONE = ITEMS.register("katana_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> KATANA_FYRITE = ITEMS.register("katana_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> KATANA_ILLUMENITE = ITEMS.register("katana_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> KATANA_MALACHITE = ITEMS.register("katana_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> SABER_MYTHRIL = ITEMS.register("saber_mythril", () -> SpartanWeaponryAPI.createSaber(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SABER_ADAMANTIUM = ITEMS.register("saber_adamantium", () -> SpartanWeaponryAPI.createSaber(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SABER_ONYX = ITEMS.register("saber_onyx", () -> SpartanWeaponryAPI.createSaber(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> SABER_SINISITE = ITEMS.register("saber_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SABER_THYRIUM = ITEMS.register("saber_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> SABER_ARGONITE = ITEMS.register("saber_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SABER_ASHSTONE = ITEMS.register("saber_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> SABER_DRAGONSTONE = ITEMS.register("saber_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SABER_FYRITE = ITEMS.register("saber_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> SABER_ILLUMENITE = ITEMS.register("saber_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SABER_MALACHITE = ITEMS.register("saber_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> RAPIER_MYTHRIL = ITEMS.register("rapier_mythril", () -> SpartanWeaponryAPI.createRapier(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> RAPIER_ADAMANTIUM = ITEMS.register("rapier_adamantium", () -> SpartanWeaponryAPI.createRapier(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> RAPIER_ONYX = ITEMS.register("rapier_onyx", () -> SpartanWeaponryAPI.createRapier(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> RAPIER_SINISITE = ITEMS.register("rapier_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> RAPIER_THYRIUM = ITEMS.register("rapier_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> RAPIER_ARGONITE = ITEMS.register("rapier_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> RAPIER_ASHSTONE = ITEMS.register("rapier_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> RAPIER_DRAGONSTONE = ITEMS.register("rapier_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> RAPIER_FYRITE = ITEMS.register("rapier_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> RAPIER_ILLUMENITE = ITEMS.register("rapier_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> RAPIER_MALACHITE = ITEMS.register("rapier_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> GREATSWORD_MYTHRIL = ITEMS.register("greatsword_mythril", () -> SpartanWeaponryAPI.createGreatsword(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GREATSWORD_ADAMANTIUM = ITEMS.register("greatsword_adamantium", () -> SpartanWeaponryAPI.createGreatsword(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GREATSWORD_ONYX = ITEMS.register("greatsword_onyx", () -> SpartanWeaponryAPI.createGreatsword(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> GREATSWORD_SINISITE = ITEMS.register("greatsword_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GREATSWORD_THYRIUM = ITEMS.register("greatsword_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> GREATSWORD_ARGONITE = ITEMS.register("greatsword_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GREATSWORD_ASHSTONE = ITEMS.register("greatsword_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> GREATSWORD_DRAGONSTONE = ITEMS.register("greatsword_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GREATSWORD_FYRITE = ITEMS.register("greatsword_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> GREATSWORD_ILLUMENITE = ITEMS.register("greatsword_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GREATSWORD_MALACHITE = ITEMS.register("greatsword_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> HAMMER_MYTHRIL = ITEMS.register("hammer_mythril", () -> SpartanWeaponryAPI.createBattleHammer(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HAMMER_ADAMANTIUM = ITEMS.register("hammer_adamantium", () -> SpartanWeaponryAPI.createBattleHammer(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HAMMER_ONYX = ITEMS.register("hammer_onyx", () -> SpartanWeaponryAPI.createBattleHammer(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> HAMMER_SINISITE = ITEMS.register("hammer_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HAMMER_THYRIUM = ITEMS.register("hammer_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> HAMMER_ARGONITE = ITEMS.register("hammer_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HAMMER_ASHSTONE = ITEMS.register("hammer_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> HAMMER_DRAGONSTONE = ITEMS.register("hammer_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HAMMER_FYRITE = ITEMS.register("hammer_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> HAMMER_ILLUMENITE = ITEMS.register("hammer_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HAMMER_MALACHITE = ITEMS.register("hammer_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> WARHAMMER_MYTHRIL = ITEMS.register("warhammer_mythril", () -> SpartanWeaponryAPI.createWarhammer(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> WARHAMMER_ADAMANTIUM = ITEMS.register("warhammer_adamantium", () -> SpartanWeaponryAPI.createWarhammer(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> WARHAMMER_ONYX = ITEMS.register("warhammer_onyx", () -> SpartanWeaponryAPI.createWarhammer(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> WARHAMMER_SINISITE = ITEMS.register("warhammer_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> WARHAMMER_THYRIUM = ITEMS.register("warhammer_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> WARHAMMER_ARGONITE = ITEMS.register("warhammer_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> WARHAMMER_ASHSTONE = ITEMS.register("warhammer_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> WARHAMMER_DRAGONSTONE = ITEMS.register("warhammer_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> WARHAMMER_FYRITE = ITEMS.register("warhammer_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> WARHAMMER_ILLUMENITE = ITEMS.register("warhammer_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> WARHAMMER_MALACHITE = ITEMS.register("warhammer_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> SPEAR_MYTHRIL = ITEMS.register("spear_mythril", () -> SpartanWeaponryAPI.createSpear(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SPEAR_ADAMANTIUM = ITEMS.register("spear_adamantium", () -> SpartanWeaponryAPI.createSpear(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SPEAR_ONYX = ITEMS.register("spear_onyx", () -> SpartanWeaponryAPI.createSpear(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> SPEAR_SINISITE = ITEMS.register("spear_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SPEAR_THYRIUM = ITEMS.register("spear_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> SPEAR_ARGONITE = ITEMS.register("spear_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SPEAR_ASHSTONE = ITEMS.register("spear_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> SPEAR_DRAGONSTONE = ITEMS.register("spear_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SPEAR_FYRITE = ITEMS.register("spear_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> SPEAR_ILLUMENITE = ITEMS.register("spear_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SPEAR_MALACHITE = ITEMS.register("spear_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> HALBERD_MYTHRIL = ITEMS.register("halberd_mythril", () -> SpartanWeaponryAPI.createHalberd(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HALBERD_ADAMANTIUM = ITEMS.register("halberd_adamantium", () -> SpartanWeaponryAPI.createHalberd(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HALBERD_ONYX = ITEMS.register("halberd_onyx", () -> SpartanWeaponryAPI.createHalberd(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> HALBERD_SINISITE = ITEMS.register("halberd_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HALBERD_THYRIUM = ITEMS.register("halberd_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> HALBERD_ARGONITE = ITEMS.register("halberd_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HALBERD_ASHSTONE = ITEMS.register("halberd_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> HALBERD_DRAGONSTONE = ITEMS.register("halberd_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HALBERD_FYRITE = ITEMS.register("halberd_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> HALBERD_ILLUMENITE = ITEMS.register("halberd_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> HALBERD_MALACHITE = ITEMS.register("halberd_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> PIKE_MYTHRIL = ITEMS.register("pike_mythril", () -> SpartanWeaponryAPI.createPike(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PIKE_ADAMANTIUM = ITEMS.register("pike_adamantium", () -> SpartanWeaponryAPI.createPike(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PIKE_ONYX = ITEMS.register("pike_onyx", () -> SpartanWeaponryAPI.createPike(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> PIKE_SINISITE = ITEMS.register("pike_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PIKE_THYRIUM = ITEMS.register("pike_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> PIKE_ARGONITE = ITEMS.register("pike_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PIKE_ASHSTONE = ITEMS.register("pike_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> PIKE_DRAGONSTONE = ITEMS.register("pike_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PIKE_FYRITE = ITEMS.register("pike_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> PIKE_ILLUMENITE = ITEMS.register("pike_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PIKE_MALACHITE = ITEMS.register("pike_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> LANCE_MYTHRIL = ITEMS.register("lance_mythril", () -> SpartanWeaponryAPI.createLance(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LANCE_ADAMANTIUM = ITEMS.register("lance_adamantium", () -> SpartanWeaponryAPI.createLance(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LANCE_ONYX = ITEMS.register("lance_onyx", () -> SpartanWeaponryAPI.createLance(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> LANCE_SINISITE = ITEMS.register("lance_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LANCE_THYRIUM = ITEMS.register("lance_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> LANCE_ARGONITE = ITEMS.register("lance_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LANCE_ASHSTONE = ITEMS.register("lance_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> LANCE_DRAGONSTONE = ITEMS.register("lance_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LANCE_FYRITE = ITEMS.register("lance_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> LANCE_ILLUMENITE = ITEMS.register("lance_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LANCE_MALACHITE = ITEMS.register("lance_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> LONGBOW_MYTHRIL = ITEMS.register("longbow_mythril", () -> SpartanWeaponryAPI.createLongbow(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGBOW_ADAMANTIUM = ITEMS.register("longbow_adamantium", () -> SpartanWeaponryAPI.createLongbow(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGBOW_ONYX = ITEMS.register("longbow_onyx", () -> SpartanWeaponryAPI.createLongbow(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> LONGBOW_SINISITE = ITEMS.register("longbow_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGBOW_THYRIUM = ITEMS.register("longbow_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> LONGBOW_ARGONITE = ITEMS.register("longbow_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGBOW_ASHSTONE = ITEMS.register("longbow_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> LONGBOW_DRAGONSTONE = ITEMS.register("longbow_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGBOW_FYRITE = ITEMS.register("longbow_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> LONGBOW_ILLUMENITE = ITEMS.register("longbow_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> LONGBOW_MALACHITE = ITEMS.register("longbow_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> CROSSBOW_MYTHRIL = ITEMS.register("heavy_crossbow_mythril", () -> SpartanWeaponryAPI.createHeavyCrossbow(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> CROSSBOW_ADAMANTIUM = ITEMS.register("heavy_crossbow_adamantium", () -> SpartanWeaponryAPI.createHeavyCrossbow(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> CROSSBOW_ONYX = ITEMS.register("heavy_crossbow_onyx", () -> SpartanWeaponryAPI.createHeavyCrossbow(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> CROSSBOW_SINISITE = ITEMS.register("heavy_crossbow_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> CROSSBOW_THYRIUM = ITEMS.register("heavy_crossbow_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> CROSSBOW_ARGONITE = ITEMS.register("heavy_crossbow_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> CROSSBOW_ASHSTONE = ITEMS.register("heavy_crossbow_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> CROSSBOW_DRAGONSTONE = ITEMS.register("heavy_crossbow_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> CROSSBOW_FYRITE = ITEMS.register("heavy_crossbow_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> CROSSBOW_ILLUMENITE = ITEMS.register("heavy_crossbow_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> CROSSBOW_MALACHITE = ITEMS.register("heavy_crossbow_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> THROWING_KNIFE_MYTHRIL = ITEMS.register("throwing_knife_mythril", () -> SpartanWeaponryAPI.createThrowingKnife(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> THROWING_KNIFE_ADAMANTIUM = ITEMS.register("throwing_knife_adamantium", () -> SpartanWeaponryAPI.createThrowingKnife(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> THROWING_KNIFE_ONYX = ITEMS.register("throwing_knife_onyx", () -> SpartanWeaponryAPI.createThrowingKnife(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> THROWING_KNIFE_SINISITE = ITEMS.register("throwing_knife_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> THROWING_KNIFE_THYRIUM = ITEMS.register("throwing_knife_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> THROWING_KNIFE_ARGONITE = ITEMS.register("throwing_knife_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> THROWING_KNIFE_ASHSTONE = ITEMS.register("throwing_knife_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> THROWING_KNIFE_DRAGONSTONE = ITEMS.register("throwing_knife_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> THROWING_KNIFE_FYRITE = ITEMS.register("throwing_knife_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> THROWING_KNIFE_ILLUMENITE = ITEMS.register("throwing_knife_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> THROWING_KNIFE_MALACHITE = ITEMS.register("throwing_knife_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> TOMAHAWK_MYTHRIL = ITEMS.register("tomahawk_mythril", () -> SpartanWeaponryAPI.createTomahawk(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> TOMAHAWK_ADAMANTIUM = ITEMS.register("tomahawk_adamantium", () -> SpartanWeaponryAPI.createTomahawk(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> TOMAHAWK_ONYX = ITEMS.register("tomahawk_onyx", () -> SpartanWeaponryAPI.createTomahawk(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> TOMAHAWK_SINISITE = ITEMS.register("tomahawk_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> TOMAHAWK_THYRIUM = ITEMS.register("tomahawk_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> TOMAHAWK_ARGONITE = ITEMS.register("tomahawk_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> TOMAHAWK_ASHSTONE = ITEMS.register("tomahawk_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> TOMAHAWK_DRAGONSTONE = ITEMS.register("tomahawk_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> TOMAHAWK_FYRITE = ITEMS.register("tomahawk_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> TOMAHAWK_ILLUMENITE = ITEMS.register("tomahawk_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> TOMAHAWK_MALACHITE = ITEMS.register("tomahawk_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> JAVELIN_MYTHRIL = ITEMS.register("javelin_mythril", () -> SpartanWeaponryAPI.createJavelin(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> JAVELIN_ADAMANTIUM = ITEMS.register("javelin_adamantium", () -> SpartanWeaponryAPI.createJavelin(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> JAVELIN_ONYX = ITEMS.register("javelin_onyx", () -> SpartanWeaponryAPI.createJavelin(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> JAVELIN_SINISITE = ITEMS.register("javelin_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> JAVELIN_THYRIUM = ITEMS.register("javelin_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> JAVELIN_ARGONITE = ITEMS.register("javelin_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> JAVELIN_ASHSTONE = ITEMS.register("javelin_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> JAVELIN_DRAGONSTONE = ITEMS.register("javelin_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> JAVELIN_FYRITE = ITEMS.register("javelin_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> JAVELIN_ILLUMENITE = ITEMS.register("javelin_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> JAVELIN_MALACHITE = ITEMS.register("javelin_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> BOOMERANG_MYTHRIL = ITEMS.register("boomerang_mythril", () -> SpartanWeaponryAPI.createBoomerang(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BOOMERANG_ADAMANTIUM = ITEMS.register("boomerang_adamantium", () -> SpartanWeaponryAPI.createBoomerang(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BOOMERANG_ONYX = ITEMS.register("boomerang_onyx", () -> SpartanWeaponryAPI.createBoomerang(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> BOOMERANG_SINISITE = ITEMS.register("boomerang_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BOOMERANG_THYRIUM = ITEMS.register("boomerang_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> BOOMERANG_ARGONITE = ITEMS.register("boomerang_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BOOMERANG_ASHSTONE = ITEMS.register("boomerang_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> BOOMERANG_DRAGONSTONE = ITEMS.register("boomerang_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BOOMERANG_FYRITE = ITEMS.register("boomerang_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> BOOMERANG_ILLUMENITE = ITEMS.register("boomerang_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BOOMERANG_MALACHITE = ITEMS.register("boomerang_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> BATTLEAXE_MYTHRIL = ITEMS.register("battleaxe_mythril", () -> SpartanWeaponryAPI.createBattleaxe(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BATTLEAXE_ADAMANTIUM = ITEMS.register("battleaxe_adamantium", () -> SpartanWeaponryAPI.createBattleaxe(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BATTLEAXE_ONYX = ITEMS.register("battleaxe_onyx", () -> SpartanWeaponryAPI.createBattleaxe(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> BATTLEAXE_SINISITE = ITEMS.register("battleaxe_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BATTLEAXE_THYRIUM = ITEMS.register("battleaxe_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> BATTLEAXE_ARGONITE = ITEMS.register("battleaxe_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BATTLEAXE_ASHSTONE = ITEMS.register("battleaxe_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> BATTLEAXE_DRAGONSTONE = ITEMS.register("battleaxe_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BATTLEAXE_FYRITE = ITEMS.register("battleaxe_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> BATTLEAXE_ILLUMENITE = ITEMS.register("battleaxe_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> BATTLEAXE_MALACHITE = ITEMS.register("battleaxe_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> MACE_MYTHRIL = ITEMS.register("flanged_mace_mythril", () -> SpartanWeaponryAPI.createFlangedMace(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> MACE_ADAMANTIUM = ITEMS.register("flanged_mace_adamantium", () -> SpartanWeaponryAPI.createFlangedMace(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> MACE_ONYX = ITEMS.register("flanged_mace_onyx", () -> SpartanWeaponryAPI.createFlangedMace(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> MACE_SINISITE = ITEMS.register("flanged_mace_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> MACE_THYRIUM = ITEMS.register("flanged_mace_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> MACE_ARGONITE = ITEMS.register("flanged_mace_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> MACE_ASHSTONE = ITEMS.register("flanged_mace_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> MACE_DRAGONSTONE = ITEMS.register("flanged_mace_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> MACE_FYRITE = ITEMS.register("flanged_mace_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> MACE_ILLUMENITE = ITEMS.register("flanged_mace_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> MACE_MALACHITE = ITEMS.register("flanged_mace_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> GLAIVE_MYTHRIL = ITEMS.register("glaive_mythril", () -> SpartanWeaponryAPI.createGlaive(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GLAIVE_ADAMANTIUM = ITEMS.register("glaive_adamantium", () -> SpartanWeaponryAPI.createGlaive(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GLAIVE_ONYX = ITEMS.register("glaive_onyx", () -> SpartanWeaponryAPI.createGlaive(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> GLAIVE_SINISITE = ITEMS.register("glaive_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GLAIVE_THYRIUM = ITEMS.register("glaive_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> GLAIVE_ARGONITE = ITEMS.register("glaive_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GLAIVE_ASHSTONE = ITEMS.register("glaive_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> GLAIVE_DRAGONSTONE = ITEMS.register("glaive_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GLAIVE_FYRITE = ITEMS.register("glaive_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> GLAIVE_ILLUMENITE = ITEMS.register("glaive_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> GLAIVE_MALACHITE = ITEMS.register("glaive_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> QUARTERSTAFF_MYTHRIL = ITEMS.register("quarterstaff_mythril", () -> SpartanWeaponryAPI.createQuarterstaff(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> QUARTERSTAFF_ADAMANTIUM = ITEMS.register("quarterstaff_adamantium", () -> SpartanWeaponryAPI.createQuarterstaff(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> QUARTERSTAFF_ONYX = ITEMS.register("quarterstaff_onyx", () -> SpartanWeaponryAPI.createQuarterstaff(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> QUARTERSTAFF_SINISITE = ITEMS.register("quarterstaff_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> QUARTERSTAFF = ITEMS.register("quarterstaff_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> QUARTERSTAFF_ARGONITE = ITEMS.register("quarterstaff_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> QUARTERSTAFF_ASHSTONE = ITEMS.register("quarterstaff_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> QUARTERSTAFF_DRAGONSTONE = ITEMS.register("quarterstaff_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> QUARTERSTAFF_FYRITE = ITEMS.register("quarterstaff_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> QUARTERSTAFF_ILLUMENITE = ITEMS.register("quarterstaff_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> QUARTERSTAFF_MALACHITE = ITEMS.register("quarterstaff_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> SCYTHE_MYTHRIL = ITEMS.register("scythe_mythril", () -> SpartanWeaponryAPI.createScythe(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SCYTHE_ADAMANTIUM = ITEMS.register("scythe_adamantium", () -> SpartanWeaponryAPI.createScythe(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SCYTHE_ONYX = ITEMS.register("scythe_onyx", () -> SpartanWeaponryAPI.createScythe(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> SCYTHE_SINISITE = ITEMS.register("scythe_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SCYTHE_THYRIUM = ITEMS.register("scythe_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> SCYTHE_ARGONITE = ITEMS.register("scythe_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SCYTHE_ASHSTONE = ITEMS.register("scythe_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> SCYTHE_DRAGONSTONE = ITEMS.register("scythe_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SCYTHE_FYRITE = ITEMS.register("scythe_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> SCYTHE_ILLUMENITE = ITEMS.register("scythe_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> SCYTHE_MALACHITE = ITEMS.register("scythe_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));

	public static final RegistryObject<Item> PARRYING_DAGGER_MYTHRIL = ITEMS.register("parrying_dagger_mythril", () -> SpartanWeaponryAPI.createParryingDagger(MYTHRIL, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_ADAMANTIUM = ITEMS.register("parrying_dagger_adamantium", () -> SpartanWeaponryAPI.createParryingDagger(ADAMANTIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_ONYX = ITEMS.register("parrying_dagger_onyx", () -> SpartanWeaponryAPI.createParryingDagger(ONYX, ItemGroupSSO.ITEM_GROUP_SSO, true));

    public static final RegistryObject<Item> PARRYING_DAGGER_SINISITE = ITEMS.register("parrying_dagger_sinisite", () -> SpartanWeaponryAPI.createDagger(SINISITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_THYRIUM = ITEMS.register("parrying_dagger_thyrium", () -> SpartanWeaponryAPI.createDagger(THYRIUM, ItemGroupSSO.ITEM_GROUP_SSO, true));
	
    public static final RegistryObject<Item> PARRYING_DAGGER_ARGONITE = ITEMS.register("parrying_dagger_argonite", () -> SpartanWeaponryAPI.createDagger(ARGONITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_ASHSTONE = ITEMS.register("parrying_dagger_ashstone", () -> SpartanWeaponryAPI.createDagger(ASHSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> PARRYING_DAGGER_DRAGONSTONE = ITEMS.register("parrying_dagger_dragonstone", () -> SpartanWeaponryAPI.createDagger(DRAGONSTONE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_FYRITE = ITEMS.register("parrying_dagger_fyrite", () -> SpartanWeaponryAPI.createDagger(FYRITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
    public static final RegistryObject<Item> PARRYING_DAGGER_ILLUMENITE = ITEMS.register("parrying_dagger_illumenite", () -> SpartanWeaponryAPI.createDagger(ILLUMENITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
	public static final RegistryObject<Item> PARRYING_DAGGER_MALACHITE = ITEMS.register("parrying_dagger_malachite", () -> SpartanWeaponryAPI.createDagger(MALACHITE, ItemGroupSSO.ITEM_GROUP_SSO, true));
}
