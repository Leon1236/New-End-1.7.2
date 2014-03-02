package com.leon1236.newend.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEndGrass extends BlockGrass {

	public BlockEndGrass(Material p_i45394_1_) {
		
			this.setStepSound(Block.soundTypeGrass);
			this.setHardness(2.0F);
			this.setResistance(2.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setBlockName(Strings.BlockEndGrass_NAME); //name of the block in texture folder
		
			}
	
	@SideOnly(Side.CLIENT)
	protected IIcon blockIcon;
	protected IIcon blockIconTop;

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_)
	{
	blockIcon = p_149651_1_.registerIcon(References.MOD_ID + ":" + ":BlockEndGrassSide".substring(5));
	blockIconTop = p_149651_1_.registerIcon(References.MOD_ID + ":" + ":BlockEndGrassTop");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int metadata)
	{
	if (side == 1) {
	return blockIconTop;
	} else {
	return blockIcon;
	}
	
}
	// Returns the quantity of items to drop on block destruction.
    
		public int quantityDropped(Random random)
	    {
	        return 1;
	    }
}