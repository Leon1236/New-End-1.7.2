package com.leon1236.newend.items;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import net.minecraft.item.ItemHoe;

public class ToolEndHoe extends ItemHoe {

	public ToolEndHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		setCreativeTab(NewEnd_Main.Tab_newend); //Place in creative tabs
		setUnlocalizedName(Strings.EndHoe_NAME); //Name of the block in lang file
		setTextureName(References.MOD_ID + ":ToolEndHoe"); //Texture for the item
	}

}
