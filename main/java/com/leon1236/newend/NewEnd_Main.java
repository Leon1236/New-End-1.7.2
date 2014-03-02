package com.leon1236.newend;

import net.minecraft.creativetab.CreativeTabs;

import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.blocks.EndForestryBlocks;
import com.leon1236.newend.blocks.EndIC2Blocks;
import com.leon1236.newend.blocks.EndVanillaBlocks;
import com.leon1236.newend.items.EndIC2Items;
import com.leon1236.newend.items.ModItems;
import com.leon1236.newend.lib.Achievements;
import com.leon1236.newend.lib.Crafting;
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
			// dependencies = "after:IC2; required-after:Forge@[1.7.2-10.12.0.1031)"
		)

    

public class NewEnd_Main {
	@SidedProxy(

			clientSide 		= References.CLIENT_PROXY_LOCATION,
			serverSide 		= References.COMMON_PROXY_LOCATION)
            public static     CommonProxy proxy;
	
	//Creative tab
    public static CreativeTabs Tab_newend = new Tab_newend(CreativeTabs.getNextID(), References.MOD_ID);
   
    // World gen 
   //NewEnd_oregen eventmanager = new NewEnd_oregen();
	
    
//preInit loads all blocks, items, configurations and more
  	@EventHandler
  	public void preInit(FMLPreInitializationEvent event){	
  	
  		    
  	    // Loads all blocks 
  		EndBlocks.init();
  		
     	// Loads all items 
  		ModItems.init();
  		
  		//Vanilla End Ores
  		EndVanillaBlocks.init();
  		
  	   //Forestry End Ores
  		EndForestryBlocks.init();

  		//IC2 Blocks
  		EndIC2Blocks.init();
		
  		//IC2 Items
  		EndIC2Items.init();
  		
  		//Crafting
  		Crafting.loadrecipe();
  		
  		//Smelting
  		Crafting.loadSmelting();
  		
  		//Achievenets
  		Achievements.loadAchievements();
  		
  		//Loads fuel handler
  		//GameRegistry.registerFuelHandler(new FuelHandler());
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
