package com.leon1236.newend.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

public class BlockEndLeadOre extends Block {

	public BlockEndLeadOre(Material p_i45394_1_) {
		
			super(p_i45394_1_);
			this.setStepSound(Block.soundTypeStone);
			this.setHardness(12.0F);
			this.setResistance(15.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setBlockName(Strings.BlockEndLeadOre_NAME); //name of the block in texture folder
			this.setBlockTextureName(References.MOD_ID + ":BlockEndLeadOre"); //sets texture for your block
			}
	
}