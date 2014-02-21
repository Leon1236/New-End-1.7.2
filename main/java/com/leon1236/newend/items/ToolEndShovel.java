package com.leon1236.newend.items;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import net.minecraft.item.ItemSpade;


public class ToolEndShovel extends ItemSpade {

	public ToolEndShovel(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		setCreativeTab(NewEnd_Main.Tab_newend); //Place in creative tabs
		setUnlocalizedName(Strings.EndShovel_NAME); //Name of the block in lang file
		setTextureName(References.MOD_ID + ":ToolEndShovel"); //Texture for the item
	}

}
