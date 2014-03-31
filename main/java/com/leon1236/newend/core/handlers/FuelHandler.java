package com.leon1236.newend.core.handlers;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.items.ModItems;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class FuelHandler implements IFuelHandler{

       public int getBurnTime(ItemStack fuel) {
    	   
    	   if(fuel == new ItemStack(ModItems.ItemEndCharcoal));
			return 3200;
	}

}
