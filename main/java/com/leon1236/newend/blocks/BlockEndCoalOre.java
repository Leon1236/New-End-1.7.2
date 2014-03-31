package com.leon1236.newend.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.items.ModItems;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

public class BlockEndCoalOre extends Block {

	public BlockEndCoalOre(Material p_i45394_1_) {
		
			super(p_i45394_1_);
			this.setStepSound(Block.soundTypeStone);
			this.setHardness(18.0F);
			this.setResistance(15.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setBlockName(Strings.BlockEndCoalOre_NAME); //name of the block in texture folder
			this.setBlockTextureName(References.MOD_ID + ":BlockEndCoalOre"); //sets texture for your block
			}
	
	    // Returns the quantity of items to drop on block destruction.
		 public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_)
		    {
		        return ModItems.ItemEndCoal; 
		        }
		 //How much of the item will be droped
		 public int quantityDropped(Random random)
		    {
		        return 1;
		    }
}