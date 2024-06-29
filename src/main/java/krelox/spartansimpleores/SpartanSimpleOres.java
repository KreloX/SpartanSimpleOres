package krelox.spartansimpleores;

import krelox.spartantoolkit.SpartanAddon;
import krelox.spartantoolkit.SpartanMaterial;
import krelox.spartantoolkit.WeaponMap;
import krelox.spartantoolkit.WeaponType;
import mod.alexndr.simplecorelib.api.helpers.TagUtils;
import mod.alexndr.simpleores.content.SimpleOresTiers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Mod(SpartanSimpleOres.MODID)
public class SpartanSimpleOres extends SpartanAddon {
    public static final String MODID = "spartansimpleores";

    public static final WeaponMap WEAPONS = new WeaponMap();
    public static final DeferredRegister<Item> ITEMS = itemRegister(MODID);

    public static final SpartanMaterial MYTHRIL = new SpartanMaterial("mythril", MODID, SimpleOresTiers.MYTHRIL, TagUtils.forgeTag("ingots/mythril"), Set.of(), Map.of());
    public static final SpartanMaterial ADAMANTIUM = new SpartanMaterial("adamantium", MODID, SimpleOresTiers.ADAMANTIUM, TagUtils.forgeTag("ingots/adamantium"), Set.of(), Map.of());
    public static final SpartanMaterial ONYX = new SpartanMaterial("onyx", MODID, SimpleOresTiers.ONYX, TagUtils.forgeTag("gems/onyx"), Set.of(), Map.of());

    public static final CreativeModeTab SPARTAN_SIMPLEORES_TAB = tab(MODID, () -> WEAPONS.get(MYTHRIL, WeaponType.GREATSWORD).get());

    public SpartanSimpleOres() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        registerSpartanWeapons(ITEMS);
        ITEMS.register(bus);
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
