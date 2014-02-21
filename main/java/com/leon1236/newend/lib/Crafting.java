package com.leon1236.newend.lib;

import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.blocks.EndVanillaBlocks;
import com.leon1236.newend.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;



public class Crafting 
{

	public static void loadrecipe()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.endarmor_Boots, 1), new Object[] {"# #","# #", Character.valueOf('#'), ModItems.ItemEndIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.endarmor_Leggings, 1), new Object[] {"###","# #","# #", Character.valueOf('#'), ModItems.ItemEndIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.endarmor_Chestplate, 1), new Object[] {"# #","###","###", Character.valueOf('#'), ModItems.ItemEndIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.endarmor_Helmet, 1), new Object[] {"###","# #", Character.valueOf('#'), ModItems.ItemEndIngot});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.EndAxe, 1), new Object[] {" ##"," S#"," S ", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
       
		GameRegistry.addRecipe(new ItemStack(ModItems.EndAxe, 1), new Object[] {"## ","#S "," S ", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.EndHoe, 1), new Object[] {" ##"," S "," S ", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
       
		GameRegistry.addRecipe(new ItemStack(ModItems.EndHoe, 1), new Object[] {"## "," S "," S ", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.EndPickaxe, 1), new Object[] {"###"," S "," S ", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
       
		GameRegistry.addRecipe(new ItemStack(ModItems.EndShovel, 1), new Object[] {"#","S","S", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
       
		GameRegistry.addRecipe(new ItemStack(ModItems.EndSword, 1), new Object[] {"#","#","S", Character.valueOf('#'), ModItems.ItemEndIngot, Character.valueOf('S'), ModItems.ItemEndStick});
       
		GameRegistry.addRecipe(new ItemStack(ModItems.ItemEndStick, 4), new Object[] {"# ","# ", Character.valueOf('#'), EndBlocks.BlockEndPlank,});
		GameRegistry.addRecipe(new ItemStack(ModItems.ItemEndStick, 4), new Object[] {" # "," # ", Character.valueOf('#'), EndBlocks.BlockEndPlank,});
		GameRegistry.addRecipe(new ItemStack(ModItems.ItemEndStick, 4), new Object[] {"  #",  "#", Character.valueOf('#'), EndBlocks.BlockEndPlank,});
		
		GameRegistry.addRecipe(new ItemStack(EndBlocks.BlockEndPlank, 4), new Object[] {"#", Character.valueOf('#'), EndBlocks.BlockEndWood,});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.ItemEndString, 3), new Object[] {"#S","#S","#S", Character.valueOf('#'), ModItems.ItemEndIngot,Character.valueOf('S'), Items.string});
		
		GameRegistry.addRecipe(new ItemStack(EndBlocks.BlockEndBlock, 1), new Object[] {"###","###","###", Character.valueOf('#'), ModItems.ItemEndIngot});
		
		GameRegistry.addRecipe(new ItemStack(EndBlocks.BlockEndBrick, 4), new Object[] {"##","##", Character.valueOf('#'), Blocks.end_stone});
		

	}
	
	public static void loadSmelting()
	{

		GameRegistry.addSmelting(EndBlocks.BlockEndOre, new ItemStack(ModItems.ItemEndIngot), 5.0F);
		GameRegistry.addSmelting(EndBlocks.BlockEndWood, new ItemStack(ModItems.ItemEndCharcoal), 3.0F);
		GameRegistry.addSmelting(EndVanillaBlocks.BlockEndIronOre, new ItemStack(Items.iron_ingot), 3.0F);
		GameRegistry.addSmelting(EndVanillaBlocks.BlockEndGoldOre, new ItemStack(Items.gold_ingot), 3.0F);
		
	}
}
