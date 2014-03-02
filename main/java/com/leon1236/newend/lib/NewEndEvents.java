package com.leon1236.newend.lib;


import com.leon1236.newend.blocks.EndBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class NewEndEvents {
	
	//Achievements
		@SubscribeEvent
		public void whenISmeltAnItemOrBlock(PlayerEvent.ItemSmeltedEvent e){
			
			if(Block.getBlockFromItem(e.smelting.getItem()).equals(EndBlocks.BlockEndOre)){
				
				e.player.addStat(Achievements.Achievenet_EndIngotsmelting, 1);
				}
			
			else if(Block.getBlockFromItem(e.smelting.getItem()).equals(EndBlocks.BlockEndWood)){
					
					e.player.addStat(Achievements.Achievenet_EndCharcoalsmelting, 2);
				}
			
			}
		
}
		
	

