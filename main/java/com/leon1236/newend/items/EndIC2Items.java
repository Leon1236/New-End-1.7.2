package com.leon1236.newend.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class EndIC2Items {
	
	public static Item IC_EndCrushedOre;
	public static Item IC_EndPurifiedChrushedOre;
	public static Item IC_EndDustSmall;
	public static Item IC_EndDust;
	public static Item IC_EndPlate;
	public static Item IC_EndDensePlate;
	public static Item IC_EndMixedMetalIngot;
	public static Item IC_EndCasing;

	
	public static void init(){
		
		IC_EndCrushedOre = new IC_EndCrushedOre();
		IC_EndPurifiedChrushedOre = new IC_EndPurifiedCrushedOre();
		IC_EndDustSmall = new IC_EndDustSmall();
		IC_EndDust = new IC_EndDust();
		IC_EndPlate = new IC_EndPlate();
		IC_EndDensePlate = new IC_EndDensePlate();
		IC_EndMixedMetalIngot = new IC_EndMixedMetalIngot();
		IC_EndCasing = new IC_EndCasing();
		
		GameRegistry.registerItem(IC_EndCrushedOre, "IC_EndCrushedOre");
		GameRegistry.registerItem(IC_EndPurifiedChrushedOre, "IC_EndPurifiedChrushedOre");
		GameRegistry.registerItem(IC_EndDustSmall, "IC_EndDustSmall");
		GameRegistry.registerItem(IC_EndDust, "IC_EndDust");
		GameRegistry.registerItem(IC_EndPlate, "IC_EndPlate");
		GameRegistry.registerItem(IC_EndDensePlate, "IC_EndDensePlate");
		GameRegistry.registerItem(IC_EndMixedMetalIngot, "IC_EndMixedMetalIngot");
		GameRegistry.registerItem(IC_EndCasing, "IC_EndCasing");
	}

}
