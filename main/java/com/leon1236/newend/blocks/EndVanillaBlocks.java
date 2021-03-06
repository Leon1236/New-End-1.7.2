package com.leon1236.newend.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class EndVanillaBlocks {

	public static Block BlockEndCoalOre;
	public static Block BlockEndRedstoneOre;
	public static Block BlockEndLapisOre;
	public static Block BlockEndQuartzOre;
	public static Block BlockEndIronOre;
	public static Block BlockEndGoldOre;
	public static Block BlockEndDiamondOre;
	public static Block BlockEndEmeraldOre;

	
	public static void init(){
		
		BlockEndCoalOre = new BlockEndCoalOre(Material.rock);
		BlockEndRedstoneOre = new BlockEndRedstoneOre(Material.rock);
		BlockEndLapisOre = new BlockEndLapisOre(Material.rock);
		BlockEndQuartzOre = new BlockEndQuartzOre(Material.rock);
		BlockEndIronOre = new BlockEndIronOre(Material.rock);
		BlockEndGoldOre = new BlockEndGoldOre(Material.rock);
		BlockEndDiamondOre = new BlockEndDiamondOre(Material.rock);
		BlockEndEmeraldOre = new BlockEndEmeraldOre(Material.rock);
		
		GameRegistry.registerBlock(BlockEndCoalOre, Strings.BlockEndCoalOre_NAME);
		GameRegistry.registerBlock(BlockEndRedstoneOre, Strings.BlockEndRedstoneOre_NAME);
		GameRegistry.registerBlock(BlockEndLapisOre, Strings.BlockEndLapisOre_NAME);
		GameRegistry.registerBlock(BlockEndQuartzOre, Strings.BlockEndQuartzOre_NAME);
		GameRegistry.registerBlock(BlockEndIronOre, Strings.BlockEndIronOre_NAME);
		GameRegistry.registerBlock(BlockEndGoldOre, Strings.BlockEndGoldOre_NAME);
		GameRegistry.registerBlock(BlockEndDiamondOre, Strings.BlockEndDiamondOre_NAME);
		GameRegistry.registerBlock(BlockEndEmeraldOre, Strings.BlockEndEmeraldOre_NAME);
		
	//Registers all of the materials into forge ore dictionary 
		OreDictionary.registerOre("oreCoal", new ItemStack(BlockEndCoalOre));
		OreDictionary.registerOre("oreRedstone", new ItemStack(BlockEndRedstoneOre));
		OreDictionary.registerOre("oreLapis", new ItemStack(BlockEndLapisOre));
		OreDictionary.registerOre("oreQuartz", new ItemStack(BlockEndQuartzOre));
		OreDictionary.registerOre("oreIron", new ItemStack(BlockEndIronOre));
		OreDictionary.registerOre("oreGold", new ItemStack(BlockEndGoldOre));
		OreDictionary.registerOre("oreDiamond", new ItemStack(BlockEndDiamondOre));
		OreDictionary.registerOre("oreEmerald", new ItemStack(BlockEndEmeraldOre));
		
		
	}
	
	
	
}

