package com.leon1236.newend.core.handlers;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;

import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.items.ModItems;

import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{
	
	private static ArrayList<FuelValue> fuelList = new ArrayList<FuelValue>();

		@Override
		public int getBurnTime(ItemStack fuel) 
		{
		return getFuelValue(fuel);
		}

	// Add Fuel rates
	public static void setFuelValues()
	{
		addFuel(new ItemStack(ModItems.ItemEndCoal), 6400);
		addFuel(new ItemStack(ModItems.ItemEndCharcoal), 3200);
		addFuel(new ItemStack(EndBlocks.BlockEndWood), 1600);
		addFuel(new ItemStack(EndBlocks.BlockEndPlank), 400);
		addFuel(new ItemStack(ModItems.ItemEndStick), 200);
		
	}

	private static void addFuel(ItemStack stack, int value)
	{
		fuelList.add(new FuelValue(stack, value));
	}

	private static int getFuelValue(ItemStack stack)
	{
		for (FuelValue fuelValue : fuelList)
		{
			ItemStack stackToCompareTo = fuelValue.getStack();

			return fuelValue.getValue();
		}

		return 0;
	}

	public static class FuelValue
	{
		private ItemStack stack;
		private int value;

		public FuelValue(ItemStack stack, int value)
		{
			this.setStack(stack);
			this.setValue(value);
		}

		public ItemStack getStack()
		{
			return stack;
		}

		public void setStack(ItemStack stack) 
		{
			this.stack = stack;
		}

		public int getValue()
		{
			return value;
		}

		public void setValue(int value) 
		{
			this.value = value;
		}
	}

	
}
