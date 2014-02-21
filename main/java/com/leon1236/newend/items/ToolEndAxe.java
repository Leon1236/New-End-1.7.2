package com.leon1236.newend.items;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import net.minecraft.item.ItemAxe;

public class ToolEndAxe extends ItemAxe{

	protected ToolEndAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(NewEnd_Main.Tab_newend); //Place in creative tabs
		setUnlocalizedName(Strings.EndAxe_NAME); //Name of the block in lang file
		setTextureName(References.MOD_ID + ":ToolEndAxe"); //Texture for the item
	}

}
