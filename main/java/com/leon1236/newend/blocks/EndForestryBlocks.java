package com.leon1236.newend.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class EndForestryBlocks {
	
	public static Block BlockEndApatiteOre;
	
	public static void init(){
		
		BlockEndApatiteOre = new BlockEndApatite(Material.rock);
		
		GameRegistry.registerBlock(BlockEndApatiteOre, Strings.BlockEndApatiteOre_NAME);
		
//Registers all of the materials into forge ore dictionary 
		OreDictionary.registerOre("oreApatite", new ItemStack(BlockEndApatiteOre));
	}
	
	
}


