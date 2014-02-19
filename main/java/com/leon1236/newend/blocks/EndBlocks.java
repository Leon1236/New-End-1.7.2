package com.leon1236.newend.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;


public class EndBlocks {
        
    /* Initializing all the blocks*/
	public static Block BlockEndOre;
	public static Block BlockEndBrick;
	public static Block BlockEndWood;
	public static Block BlockEndPlank;
	public static Block BlockEndBlock;
	public static Block BlockEndLeaves;
	public static Block BlockEndSapling;
	
	
        
public static void init(){
                
    /*Spreading all blocks to different classes. They carry the blockID*/
	BlockEndOre = new BlockEndOre(Material.rock);
	BlockEndBrick = new BlockEndBrick(Material.rock);
	BlockEndWood = new BlockEndWood(Material.rock);
	BlockEndPlank = new BlockEndPlank(Material.rock);
	BlockEndBlock = new BlockEndBlock(Material.rock);
	BlockEndLeaves = new BlockEndLeaves(Material.rock);
	
	
	/*Registering all the blocks. Args: block, name*/
	GameRegistry.registerBlock(BlockEndOre, Strings.BlockEndOre_NAME);
	GameRegistry.registerBlock(BlockEndBrick, Strings.BlockEndBrick_NAME);
	GameRegistry.registerBlock(BlockEndWood, Strings.BlockEndWood_NAME);
	GameRegistry.registerBlock(BlockEndPlank, Strings.BlockEndPlank_NAME);
	GameRegistry.registerBlock(BlockEndBlock, Strings.BlockEndBlock_NAME);
	GameRegistry.registerBlock(BlockEndLeaves, Strings.BlockEndLeaves_NAME);
	
	
        }

//Registers all of the materials into forge ore dictionary 
	public static void oreRegistration(){
		
          OreDictionary.registerOre("oreEnd", new ItemStack(BlockEndOre));
          OreDictionary.registerOre("logWood", new ItemStack(BlockEndWood));
          OreDictionary.registerOre("plankWood", new ItemStack(BlockEndPlank));
          OreDictionary.registerOre("leavesTree", new ItemStack(BlockEndLeaves));
          OreDictionary.registerOre("saplingTree", new ItemStack(BlockEndSapling));
        
  }



}