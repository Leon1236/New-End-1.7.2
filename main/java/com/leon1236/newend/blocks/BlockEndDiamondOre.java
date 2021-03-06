package com.leon1236.newend.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEndDiamondOre extends Block {

	public BlockEndDiamondOre(Material p_i45394_1_) {
		
			super(p_i45394_1_);
			this.setStepSound(Block.soundTypeStone);
			this.setHardness(10.0F);
			this.setResistance(15.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setBlockName(Strings.BlockEndDiamondOre_NAME); //name of the block in texture folder
			this.setBlockTextureName(References.MOD_ID + ":BlockEndDiamondOre"); //sets texture for your block
			}
	// Returns the quantity of items to drop on block destruction.
    
	public Item getItemDropped()
    {
        return this == EndVanillaBlocks.BlockEndDiamondOre ? Items.diamond  : Item.getItemFromBlock(this);
    }
}