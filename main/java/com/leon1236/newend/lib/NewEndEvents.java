package com.leon1236.newend.lib;


import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class NewEndEvents {
	
	//Achievements
		@SubscribeEvent
		public void smelting(PlayerEvent.ItemSmeltedEvent e){
			
			if(Block.getBlockFromItem(e.smelting.getItem()).equals(EndBlocks.BlockEndOre)){
				
				e.player.addStat(Achievements.Achievenet_EndIngotsmelting, 1);
				}
			
			else if(Block.getBlockFromItem(e.smelting.getItem()).equals(EndBlocks.BlockEndWood)){
					
					e.player.addStat(Achievements.Achievenet_EndCharcoalsmelting, 2);
				}
		}
			
		@SubscribeEvent
		public void crafting(PlayerEvent.ItemCraftedEvent e){
			
			if(Block.getBlockFromItem(e.crafting.getItem()).equals(ModItems.EndAxe)){
				
				e.player.addStat(Achievements.Achievenet_AxeCrafting, 3);
				}
			
			else if(Block.getBlockFromItem(e.crafting.getItem()).equals(ModItems.EndHoe)){
					
					e.player.addStat(Achievements.Achievenet_HoeCrafting, 4);
				}
		}
}
		
	

