package com.leon1236.newend.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.material.Material;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

public class BlockEndGravel extends BlockGravel {

	public BlockEndGravel(Material p_i45394_1_) {
		
			this.setStepSound(Block.soundTypeGravel);
			this.setHardness(2.0F);
			this.setResistance(3.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setBlockName(Strings.BlockEndGravel_NAME); //name of the block in texture folder
			this.setBlockTextureName(References.MOD_ID + ":BlockEndGravel"); //sets texture for your block
			}
	// Returns the quantity of items to drop on block destruction.
    
		public int quantityDropped(Random random)
	    {
	        return 1;
	    }
}