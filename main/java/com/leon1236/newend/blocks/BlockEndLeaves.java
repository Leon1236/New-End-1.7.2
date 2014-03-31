package com.leon1236.newend.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.World;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEndLeaves extends Block {

	public BlockEndLeaves(Material p_i45394_1_) {
		
			super(p_i45394_1_);
			this.setStepSound(Block.soundTypeGrass);
			this.setHardness(1.0F);
			this.setResistance(5.0F);
			setCreativeTab(NewEnd_Main.Tab_newend); //place in creative tabs
			this.setBlockName(Strings.BlockEndLeaves_NAME); //name of the block in texture folder
			this.setBlockTextureName(References.MOD_ID + ":BlockEndLeaves"); //sets texture for your block
			}
	

	//Color of the leaves
	@SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        double d0 = -1.0D;
        return ColorizerFoliage.getFoliageColor(d0, d0);
    }
	
	// Returns the color this block should be rendered. Used by leaves
    @SideOnly(Side.CLIENT)
        public int getRenderColor(int par1)
    {
        return (par1 & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((par1 & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : ColorizerFoliage.getFoliageColorBasic());
    }
	
    //Returns the quantity of items to drop on block destruction.
    public int quantityDropped(Random par1Random)
   {
       return par1Random.nextInt(20) == 0 ? 1 : 0;
   }
     
    /*Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
    block and l is the block's subtype/damage.
    */
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
     super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
    }
 
    /* Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
    * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
    */
    public boolean isOpaqueCube()
    {
    return false;
    }
    
    //Something
    public boolean isShearable(ItemStack item, World world, int x, int y, int z)
    {
    return true;
    }

    //Something
    @Override
    public void beginLeavesDecay(World world, int x, int y, int z)
    {
    world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
    }
    
    //Something
    public boolean isLeaves(World world, int x, int y, int z)
    {
    return true;
    }
    
        

}