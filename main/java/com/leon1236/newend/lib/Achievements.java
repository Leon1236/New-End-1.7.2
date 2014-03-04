package com.leon1236.newend.lib;

import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;

import com.leon1236.newend.items.ModItems;

public class Achievements {
	
	public static Achievement Achievenet_EndIngotsmelting;
	public static Achievement Achievenet_EndCharcoalsmelting;
	public static Achievement Achievenet_PickaxeCrafting;
	public static Achievement Achievenet_AxeCrafting;
	public static Achievement Achievenet_SwordCrafting;
	public static Achievement Achievenet_HoeCrafting;
	

	public static void loadAchievements() {
		
		Achievenet_EndIngotsmelting = new Achievement("achivment.SmeltEndIngot", "EndIngot", 0, 0, ModItems.ItemEndIngot, AchievementList.openInventory).registerStat();
		Achievenet_EndCharcoalsmelting = new Achievement("achivment.SmeltEndCharcoal", "EndCharcoal", 3, 1, ModItems.ItemEndCharcoal, AchievementList.openInventory).registerStat();
		Achievenet_PickaxeCrafting = new Achievement("achivment.CraftEndPickaxe", "EndPickaxe", 3, 3, ModItems.EndPickaxe, Achievenet_EndIngotsmelting).registerStat();
		Achievenet_AxeCrafting = new Achievement("achivment.CraftEndAxe", "EndAxe", 3, 5,ModItems.EndAxe, Achievenet_EndIngotsmelting).registerStat();
		Achievenet_SwordCrafting = new Achievement("achivment.CraftEndSword", "EndSword", 2, 4, ModItems.EndSword, Achievenet_EndIngotsmelting).registerStat();
		Achievenet_HoeCrafting = new Achievement("achivment.CraftEndHoe", "EndHoe", 3, 6, ModItems.EndHoe, Achievenet_EndIngotsmelting).registerStat();
	
		AchievementPage.registerAchievementPage(new AchievementPage("New End", new Achievement[]{Achievenet_EndIngotsmelting, Achievenet_EndCharcoalsmelting, Achievenet_PickaxeCrafting, Achievenet_AxeCrafting, Achievenet_SwordCrafting, Achievenet_HoeCrafting}));
	
		
	}

}

