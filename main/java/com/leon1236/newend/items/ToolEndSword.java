package com.leon1236.newend.items;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import net.minecraft.item.ItemSword;

public class ToolEndSword extends ItemSword {

	public ToolEndSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		setCreativeTab(NewEnd_Main.Tab_newend); //Place in creative tabs
		setUnlocalizedName(Strings.EndSword_NAME); //Name of the block in lang file
		setTextureName(References.MOD_ID + ":ToolEndSword"); //Texture for the item
	}

}
