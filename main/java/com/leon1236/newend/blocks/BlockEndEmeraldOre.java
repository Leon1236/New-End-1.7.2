package com.leon1236.newend.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEndEmeraldOre extends Block {

	public BlockEndEmeraldOre(Material p_i45394_1_) {
		
			super(p_i45394_1_);
			this.setStepSound(Block.soundTypeStone);
			this.setHardness(12.0F);
			this.setResistance(15.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setBlockName(Strings.BlockEndEmeraldOre_NAME); //name of the block in texture folder
			this.setBlockTextureName(References.MOD_ID + ":BlockEndEmeraldOre"); //sets texture for your block
	}
	
	// Returns the quantity of items to drop on block destruction.
    
		public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return this == EndVanillaBlocks.BlockEndEmeraldOre ? Items.emerald  : Item.getItemFromBlock(this);
	    }
}