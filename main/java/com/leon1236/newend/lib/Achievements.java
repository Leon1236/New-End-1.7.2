package com.leon1236.newend.lib;

import com.leon1236.newend.items.ModItems;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class Achievements {
	
	public static Achievement Achievenet_EndIngotsmelting;
	public static Achievement Achievenet_EndCharcoalsmelting;
	public static Achievement Achievenet_PickaxeCrafting;
	public static Achievement Achievenet_AxeCrafting;
	public static Achievement Achievenet_SwordCrafting;
	public static Achievement Achievenet_HoeCrafting;
	

	public static void loadAchievements() {
		
		Achievenet_EndIngotsmelting = new Achievement("achivment.EndIngotsmelting", "EndIngotsmelting", 0, 0, new ItemStack(ModItems.EndPickaxe), (Achievement)null).registerStat();
		Achievenet_EndCharcoalsmelting = new Achievement("achivment.EndCharcoalsmelting", "EndCharcoalsmelting", 1, 1, new ItemStack(ModItems.EndPickaxe), (Achievement)null).registerStat();
		Achievenet_PickaxeCrafting = new Achievement("achivment.Pickaxecrafting", "EndPickaxe", 2, 3, new ItemStack(ModItems.EndPickaxe), (Achievement)null).registerStat();
		Achievenet_AxeCrafting = new Achievement("achivment.AxeCrafting", "EndAxe", 3, 5, new ItemStack(ModItems.EndAxe), (Achievement)null).registerStat();
		Achievenet_SwordCrafting = new Achievement("achivment.SwordCrafting", "EndSword", 2, 4, new ItemStack(ModItems.EndSword), (Achievement)null).registerStat();
		Achievenet_HoeCrafting = new Achievement("achivment.HoeCrafting", "EndHoe", 3, 6, new ItemStack(ModItems.EndHoe), (Achievement)null).registerStat();
	
		AchievementPage.registerAchievementPage(new AchievementPage("New End", new Achievement[]{Achievenet_EndIngotsmelting, Achievenet_EndCharcoalsmelting, Achievenet_PickaxeCrafting, Achievenet_AxeCrafting, Achievenet_SwordCrafting, Achievenet_HoeCrafting}));
	
		
	}

}

