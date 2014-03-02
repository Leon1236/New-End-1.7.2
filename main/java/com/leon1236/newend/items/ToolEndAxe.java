package com.leon1236.newend.items;

import java.util.List;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ToolEndAxe extends ItemAxe{

	protected ToolEndAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(NewEnd_Main.Tab_newend); //Place in creative tabs
		setUnlocalizedName(Strings.EndAxe_NAME); //Name of the block in lang file
		setTextureName(References.MOD_ID + ":ToolEndAxe"); //Texture for the item
	}
	
	//Information on the item
		@Override
	    public void addInformation(ItemStack itemStack, EntityPlayer player,
	            List infoList, boolean bool)
	    {
	        int max = itemStack.getMaxDamage();
	        infoList.add("Damage Left: " + (max - itemStack.getItemDamage()) + "/"
	                + max);
	    }

}
