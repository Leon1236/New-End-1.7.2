package com.leon1236.newend.lib;

import com.leon1236.newend.items.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;

public class Achievements {
	
	public static Achievement Achievenet_EndIngotsmelting;
	public static Achievement Achievenet_EndCharcoalsmelting;
	public static Achievement Achievenet_PickaxeCrafting;
	public static Achievement Achievenet_AxeCrafting;
	public static Achievement Achievenet_SwordCrafting;
	public static Achievement Achievenet_HoeCrafting;
	

	public static void loadAchievements() {
		
		Achievenet_PickaxeCrafting = new Achievement("achivment.Pickaxecrafting", "EndPickaxe", 0, 0, new ItemStack(ModItems.EndPickaxe), (Achievement)null).registerStat();
		Achievenet_AxeCrafting = new Achievement("achivment.AxeCrafting", "EndAxe", 0, 0, new ItemStack(ModItems.EndAxe), (Achievement)null).registerStat();
		Achievenet_SwordCrafting = new Achievement("achivment.SwordCrafting", "EndSword", 0, 0, new ItemStack(ModItems.EndSword), (Achievement)null).registerStat();
		Achievenet_HoeCrafting = new Achievement("achivment.HoeCrafting", "EndHoe", 0, 0, new ItemStack(ModItems.EndHoe), (Achievement)null).registerStat();
	}

}
