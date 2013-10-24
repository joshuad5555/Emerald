package com.joshuad5555.emerald.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public int addArmor(String armor) {
	    return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
}
