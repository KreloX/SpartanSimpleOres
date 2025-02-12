package krelox.spartansimpleores;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.WeaponTrait;
import krelox.spartantoolkit.*;
import mod.alexndr.simplecorelib.api.helpers.TagUtils;
import mod.alexndr.simpleores.content.SimpleOresTiers;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

@Mod(SpartanSimpleOres.MODID)
public class SpartanSimpleOres extends SpartanAddon {
    public static final String MODID = "spartansimpleores";

    public static final WeaponMap WEAPONS = new WeaponMap();
    public static final DeferredRegister<Item> ITEMS = itemRegister(MODID);
    public static final DeferredRegister<WeaponTrait> TRAITS = traitRegister(MODID);

    // Traits
    public static final RegistryObject<WeaponTrait> FLAME = registerTrait(TRAITS, new BetterWeaponTrait("flame", SpartanSimpleOres.MODID, WeaponTrait.TraitQuality.POSITIVE) {
        @Override
        public String getDescription() {
            return "Shoots burning projectiles";
        }

        @Override
        public void onProjectileSpawn(WeaponMaterial material, AbstractArrow projectile) {
            projectile.setSecondsOnFire(100);
        }
    }.setRanged());

    // Materials
    public static final SpartanMaterial MYTHRIL = new SpartanMaterial("mythril", MODID, SimpleOresTiers.MYTHRIL, TagUtils.forgeTag("ingots/mythril"));
    public static final SpartanMaterial ADAMANTIUM = new SpartanMaterial("adamantium", MODID, SimpleOresTiers.ADAMANTIUM, TagUtils.forgeTag("ingots/adamantium"));
    public static final SpartanMaterial ONYX = new SpartanMaterial("onyx", MODID, SimpleOresTiers.ONYX, TagUtils.forgeTag("gems/onyx"), FLAME);

    public static final CreativeModeTab SPARTAN_SIMPLEORES_TAB = tab(MODID, () -> WEAPONS.get(MYTHRIL, WeaponType.GREATSWORD).get());

    public SpartanSimpleOres() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        registerSpartanWeapons(ITEMS);
        ITEMS.register(bus);
        TRAITS.register(bus);
    }

    @Override
    public String modid() {
        return MODID;
    }

    @Override
    public List<SpartanMaterial> getMaterials() {
        return List.of(MYTHRIL, ADAMANTIUM, ONYX);
    }

    @Override
    public CreativeModeTab getTab() {
        return SPARTAN_SIMPLEORES_TAB;
    }

    @Override
    public WeaponMap getWeaponMap() {
        return WEAPONS;
    }
}
