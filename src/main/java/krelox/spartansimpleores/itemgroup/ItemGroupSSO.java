package krelox.spartansimpleores.itemgroup;

import krelox.spartansimpleores.init.ItemRegistrySSO;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupSSO extends ItemGroup
{
	public static final ItemGroupSSO ITEM_GROUP_SSO = new ItemGroupSSO(ItemGroup.TABS.length, "sw_simpleores");

	public ItemGroupSSO(int index, String label) 
	{
		super(index, label);
	}

	@Override
	public ItemStack makeIcon() 
	{
		return new ItemStack(ItemRegistrySSO.GREATSWORD_MYTHRIL.get());
	}
}
