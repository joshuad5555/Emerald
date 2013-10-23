package com.joshuad5555.emerald.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmeraldSword extends ItemSword {

	public ItemEmeraldSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName("swordEmerald");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
            this.itemIcon = ir.registerIcon("joshuad5555_emerald:swordEmerald");
    }
	
}
