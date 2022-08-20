package krelox.spartansimpleores;

import krelox.spartansimpleores.init.ItemRegistrySSO;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SpartanSimpleOres.MODID)
public class SpartanSimpleOres 
{
	public static final String MODID = "spartansimpleores";
	
	public SpartanSimpleOres() 
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
		ItemRegistrySSO.ITEMS.register(bus);
	}
}
