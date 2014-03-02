package com.leon1236.newend.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Tool material
	public static ToolMaterial EndToolMaterial;
	public static ArmorMaterial EndArmorMaterial;
	
	//Item reg
	public static Item ItemEndIngot;
	public static Item ItemEndCoal;
	public static Item ItemEndCharcoal;
	public static Item ItemEndStick;	
	public static Item ItemEndString;
	public static Item EndSword;
	public static Item EndHoe;
	public static Item EndAxe;
	public static Item EndPickaxe;
	public static Item EndShovel;
	public static Item endarmor_Helmet;
	public static Item endarmor_Chestplate;
	public static Item endarmor_Leggings;
	public static Item endarmor_Boots;
	
	public static void init(){
		
		EndToolMaterial = EnumHelper.addToolMaterial(Strings.EndToolMaterial, 3, 2000, 12.0F, 3, 30);
		EndArmorMaterial = EnumHelper.addArmorMaterial(Strings.EndArmorMaterial, 66, new int[] { 6, 9, 9, 6 }, 30);
		
		ItemEndIngot = new ItemEndIngot();
		ItemEndCoal = new ItemEndCoal();
		ItemEndCharcoal = new ItemEndCharcoal();
		ItemEndStick = new ItemEndStick();
		ItemEndString = new ItemEndString();
		
		EndSword = new ToolEndSword(EndToolMaterial);
		EndHoe = new ToolEndHoe(EndToolMaterial);
		EndAxe = new ToolEndAxe(EndToolMaterial);
		EndPickaxe = new ToolEndPickaxe(EndToolMaterial);
		EndShovel = new ToolEndShovel(EndToolMaterial);
		
		//Armor
		endarmor_Helmet = new EndArmor(EndArmorMaterial, NewEnd_Main.proxy.addArmor("newendarmor"), 0);
		endarmor_Chestplate = new EndArmor(EndArmorMaterial, NewEnd_Main.proxy.addArmor("newendarmor"), 1);
		endarmor_Leggings = new EndArmor(EndArmorMaterial, NewEnd_Main.proxy.addArmor("newendarmor"), 2);
		endarmor_Boots = new EndArmor(EndArmorMaterial, NewEnd_Main.proxy.addArmor("newendarmor"), 3);
		
		GameRegistry.registerItem(ItemEndIngot, "ItemEndIngot");
		GameRegistry.registerItem(ItemEndCoal, "ItemEndCoal");
		GameRegistry.registerItem(ItemEndCharcoal, "ItemEndCharcoal");
		GameRegistry.registerItem(ItemEndStick, "ItemEndStick");
		GameRegistry.registerItem(ItemEndString, "ItemEndString");
		
		GameRegistry.registerItem(EndSword, "EndSword");
		GameRegistry.registerItem(EndHoe, "EndHoe");
		GameRegistry.registerItem(EndAxe, "EndAxe");
		GameRegistry.registerItem(EndPickaxe, "EndPickaxe");
		GameRegistry.registerItem(EndShovel, "EndShovel");
		
		GameRegistry.registerItem(endarmor_Helmet, "endarmor_Helmet");
		GameRegistry.registerItem(endarmor_Chestplate, "endarmor_Chestplate");
		GameRegistry.registerItem(endarmor_Leggings, "endarmor_Leggings");
		GameRegistry.registerItem(endarmor_Boots, "endarmor_Boots");
		
		
	}
	
	//Registers all of the materials into forge ore dictionary 
	public static void oreRegistration()
    {
            OreDictionary.registerOre("ingotEnd", new ItemStack(ItemEndIngot)); 
            OreDictionary.registerOre("stickWood", new ItemStack(ItemEndStick));
    }
	
	

}
