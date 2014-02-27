package com.leon1236.newend.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.leon1236.newend.blocks.EndBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



public class Tab_newend extends CreativeTabs {
	public Tab_newend(int id, String name){
		super(id, name);
	}

	@Override
	public ItemStack getIconItemStack(){

		return new ItemStack(EndBlocks.BlockEndOre);

	}

	@Override
	public Item getTabIconItem() {
		
		return null;
	}

	

}
