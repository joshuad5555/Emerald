package com.joshuad5555.emerald;

import java.io.File;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;

import com.joshuad5555.emerald.item.ItemEmeraldAxe;
import com.joshuad5555.emerald.item.ItemEmeraldBoots;
import com.joshuad5555.emerald.item.ItemEmeraldChestplate;
import com.joshuad5555.emerald.item.ItemEmeraldHelmet;
import com.joshuad5555.emerald.item.ItemEmeraldHoe;
import com.joshuad5555.emerald.item.ItemEmeraldLeggings;
import com.joshuad5555.emerald.item.ItemEmeraldPickaxe;
import com.joshuad5555.emerald.item.ItemEmeraldSpade;
import com.joshuad5555.emerald.item.ItemEmeraldSword;
import com.joshuad5555.emerald.lib.Reference;
import com.joshuad5555.emerald.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Chicken's Emerald Mod
 * 
 * Main mod class for the Minecraft Mod Chicken's Emerald Mod
 * 
 * @author joshuad5555
 *
 */

@Mod(modid = "CE", name = "Chicken's Emerald Mod", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Emerald {

	@Instance("Emerald")
	public Emerald instance;
	
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_PATH, serverSide = Reference.COMMON_PROXY_PATH)
    public static CommonProxy proxy;
    
    //Item Ids
    public static int swordEmeraldID;
    public static int spadeEmeraldID;
    public static int pickaxeEmeraldID;
    public static int axeEmeraldID;
    public static int hoeEmeraldID;
    public static int helmetEmeraldID;
    public static int chestplateEmeraldID;
    public static int leggingsEmeraldID;
    public static int bootsEmeraldID;
    
    //Items
    public static Item swordEmerald;
    public static Item spadeEmerald;
    public static Item pickaxeEmerald;
    public static Item axeEmerald;
    public static Item hoeEmerald;
    public static Item helmetEmerald;
    public static Item chestplateEmerald;
    public static Item leggingsEmerald;
    public static Item bootsEmerald;
    
    //Emum Materials
    public static EnumToolMaterial toolEmerald = EnumHelper.addToolMaterial("EMERALD", 3, 3122, 16F, 6F, 20);
    public static EnumArmorMaterial armorEmerald = EnumHelper.addArmorMaterial("EMERALD", 66, new int[]{6, 16, 12, 6}, 20);

    //Pre Initialization
    @EventHandler
    public void load(FMLPreInitializationEvent event) {
  
        Configuration config = new Configuration(new File("config/Emerald.cfg"));
        
        config.load();
                     
                //Item Ids
                swordEmeraldID = config.get("Items", "Emerald Sword", 5000).getInt();
                spadeEmeraldID = config.get("Items", "Emerald Shovel", 5001).getInt();
                pickaxeEmeraldID = config.get("Items", "Emerald Pickaxe", 5002).getInt();       
                axeEmeraldID = config.get("Items", "Emerald Axe", 5003).getInt();       
                hoeEmeraldID = config.get("Items", "Emerald Hoe", 5004).getInt();       
                helmetEmeraldID = config.get("Items", "Emerald Helmet", 5005).getInt();
                chestplateEmeraldID = config.get("Items", "Emerald Chestplate", 5006).getInt();
                leggingsEmeraldID = config.get("Items", "Emerald Leggings", 5007).getInt();       
                bootsEmeraldID = config.get("Items", "Emerald Boots", 5008).getInt();             
                
        config.save();
    	
    }
    
    //Initialization
    @EventHandler
    public void load(FMLInitializationEvent event) {
  
        //Items
        swordEmerald = new ItemEmeraldSword(swordEmeraldID, toolEmerald);
        LanguageRegistry.addName(swordEmerald, "Emerald Sword");
        GameRegistry.addRecipe(new ItemStack(Emerald.swordEmerald), "E  ", "E  ", "S  ", 'E', Item.emerald, 'S', Item.stick);
        GameRegistry.addRecipe(new ItemStack(Emerald.swordEmerald), " E ", " E ", " S ", 'E', Item.emerald, 'S', Item.stick);
        GameRegistry.addRecipe(new ItemStack(Emerald.swordEmerald), "  E", "  E", "  S", 'E', Item.emerald, 'S', Item.stick);
        
        spadeEmerald = new ItemEmeraldSpade(spadeEmeraldID, toolEmerald);
        LanguageRegistry.addName(spadeEmerald, "Emerald Shovel");
        GameRegistry.addRecipe(new ItemStack(Emerald.spadeEmerald), "E  ", "S  ", "S  ", 'E', Item.emerald, 'S', Item.stick);
        GameRegistry.addRecipe(new ItemStack(Emerald.spadeEmerald), " E ", " S ", " S ", 'E', Item.emerald, 'S', Item.stick);
        GameRegistry.addRecipe(new ItemStack(Emerald.spadeEmerald), "  E", "  S", "  S", 'E', Item.emerald, 'S', Item.stick);
        
        pickaxeEmerald = new ItemEmeraldPickaxe(pickaxeEmeraldID, toolEmerald);
        LanguageRegistry.addName(pickaxeEmerald, "Emerald Pickaxe");
        GameRegistry.addRecipe(new ItemStack(Emerald.pickaxeEmerald), "EEE", " S ", " S ", 'E', Item.emerald, 'S', Item.stick);

        
        axeEmerald = new ItemEmeraldAxe(axeEmeraldID, toolEmerald);
        LanguageRegistry.addName(axeEmerald, "Emerald Axe");
        GameRegistry.addRecipe(new ItemStack(Emerald.axeEmerald), "EE ", "ES ", " S ", 'E', Item.emerald, 'S', Item.stick);
        GameRegistry.addRecipe(new ItemStack(Emerald.axeEmerald), " EE", " SE", " S ", 'E', Item.emerald, 'S', Item.stick);
        
        hoeEmerald = new ItemEmeraldHoe(hoeEmeraldID, toolEmerald);
        LanguageRegistry.addName(hoeEmerald, "Emerald Hoe");
        GameRegistry.addRecipe(new ItemStack(Emerald.hoeEmerald), "EE ", " S ", " S ", 'E', Item.emerald, 'S', Item.stick);
        GameRegistry.addRecipe(new ItemStack(Emerald.hoeEmerald), " EE", " S ", " S ", 'E', Item.emerald, 'S', Item.stick);
    	
        helmetEmerald = new ItemEmeraldHelmet(helmetEmeraldID, armorEmerald, proxy.addArmor("Emerald"), 0);
        LanguageRegistry.addName(helmetEmerald, "Emerald Helmet");
        GameRegistry.addRecipe(new ItemStack(Emerald.helmetEmerald), "EEE", "E E", 'E', Item.emerald);

        chestplateEmerald = new ItemEmeraldChestplate(chestplateEmeraldID, armorEmerald, proxy.addArmor("Emerald"), 1);
        LanguageRegistry.addName(chestplateEmerald, "Emerald Chestplate");
        GameRegistry.addRecipe(new ItemStack(Emerald.chestplateEmerald), "E E", "EEE", "EEE", 'E', Item.emerald);
        
        leggingsEmerald = new ItemEmeraldLeggings(leggingsEmeraldID, armorEmerald, proxy.addArmor("Emerald"), 2);
        LanguageRegistry.addName(leggingsEmerald, "Emerald Leggings");
        GameRegistry.addRecipe(new ItemStack(Emerald.leggingsEmerald), "EEE", "E E", "E E", 'E', Item.emerald);
        
        bootsEmerald = new ItemEmeraldBoots(bootsEmeraldID, armorEmerald, proxy.addArmor("Emerald"), 3);
        LanguageRegistry.addName(bootsEmerald, "Emerald Boots");
        GameRegistry.addRecipe(new ItemStack(Emerald.bootsEmerald), "E E", "E E", 'E', Item.emerald);
        
    }
    
    //Post Initialization
    @EventHandler
    public void load(FMLPostInitializationEvent event) {
            
    }
    
}
