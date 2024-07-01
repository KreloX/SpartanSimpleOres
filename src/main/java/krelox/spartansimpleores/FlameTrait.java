package krelox.spartansimpleores;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.oblivioussp.spartanweaponry.api.trait.RangedCallbackWeaponTrait;
import net.minecraft.world.entity.projectile.AbstractArrow;

public class FlameTrait extends RangedCallbackWeaponTrait {
    public FlameTrait() {
        super("flame", SpartanSimpleOres.MODID, TraitQuality.POSITIVE);
        setRanged();
    }

    @Override
    public void onProjectileSpawn(WeaponMaterial material, AbstractArrow projectile) {
        projectile.setSecondsOnFire(100);
    }
}
