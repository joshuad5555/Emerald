package com.joshuad5555.emerald.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemEmeraldAxe extends ItemAxe {

	public ItemEmeraldAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName("axeEmerald");
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
            this.itemIcon = ir.registerIcon("joshuad5555_emerald:axeEmerald");
    }

}
