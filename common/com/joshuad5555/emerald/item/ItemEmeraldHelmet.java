package com.joshuad5555.emerald.item;

import com.joshuad5555.emerald.lib.Reference;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEmeraldHelmet extends ItemArmor {

	public ItemEmeraldHelmet(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setUnlocalizedName("helmetEmerald");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
            this.itemIcon = ir.registerIcon("joshuad5555_emerald:helmetEmerald");
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
    	return Reference.EMERALD_HELMET_TEXTURE;
    }
    
}
