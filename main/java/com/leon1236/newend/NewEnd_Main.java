package com.leon1236.newend;

import net.minecraft.creativetab.CreativeTabs;

import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.blocks.EndForestryBlocks;
import com.leon1236.newend.blocks.EndIC2Blocks;
import com.leon1236.newend.blocks.EndVanillaBlocks;
import com.leon1236.newend.items.EndIC2Items;
import com.leon1236.newend.items.ModItems;
import com.leon1236.newend.lib.Crafting;
import com.leon1236.newend.lib.EndCommonProxy;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Tab_newend;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


//Basic stuff Forge needs
     @Mod( 	
		
    		 name 				= References.MOD_NAME,
			 modid 				= References.MOD_ID,
			 version 			= References.VERSION
		)

    

public class NewEnd_Main {
	@SidedProxy(

			clientSide 		= References.CLIENT_PROXY_LOCATION,
			serverSide 		= References.COMMON_PROXY_LOCATION)
            public static     EndCommonProxy proxy;
	
	//Creative tab
    public static CreativeTabs Tab_newend = new Tab_newend(CreativeTabs.getNextID(), References.MOD_ID);
   
    // World gen 
   //  NewEnd_oregen eventmanager = new NewEnd_oregen();
	
    
//preInit loads all blocks, items, configurations and more
  	@EventHandler
  	public void preInit(FMLPreInitializationEvent event){	
  	
  		// Loads config
  		//ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath()+ File.separator + References.MOD_ID + File.separator + References.MOD_ID + ".cfg"));
  		     
  	    // Loads all blocks 
  		EndBlocks.init();
  		
     	// Loads all items 
  		ModItems.init();
  		
  		//Vanilla End Ores
  		EndVanillaBlocks.init();
  		
  	   //Forestry End Ores
  		EndForestryBlocks.init();
  		
  		//Crafting
  		Crafting.loadrecipe();
  		
  		//Smelting
  		//Crafting.loadSmelting();
 		
  		//Loads fuel handler
  		//GameRegistry.registerFuelHandler(new FuelHandler());
  		
  		//IC2 Blocks
  		EndIC2Blocks.init();
		
  		//IC2 Items
  		EndIC2Items.init();
  		
  	}
  	
//init loads all gui's, listeners and more
  	@EventHandler
  	public void init(FMLInitializationEvent event){
  	
  	
  	}
  	
//postInit loads everything that has to load after all mods have been loaded
  	@EventHandler
  	public void postInit(FMLPostInitializationEvent event){
  		
  		
  	}
  	
}
