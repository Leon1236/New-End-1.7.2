package com.leon1236.newend.items;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;

import net.minecraft.item.ItemPickaxe;

public class ToolEndPickaxe extends ItemPickaxe {

	protected ToolEndPickaxe(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		setCreativeTab(NewEnd_Main.Tab_newend); //Place in creative tabs
		setUnlocalizedName(Strings.EndPickaxe_NAME); //Name of the block in lang file
		setTextureName(References.MOD_ID + ":ToolEndPickaxe"); //Texture for the item
	}

}
