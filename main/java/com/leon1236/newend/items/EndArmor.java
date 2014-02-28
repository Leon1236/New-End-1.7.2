package com.leon1236.newend.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.leon1236.newend.lib.References;

public class EndArmor extends ItemArmor {

	public EndArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if (stack.getItem() == ModItems.endarmor_Helmet || stack.getItem() == ModItems.endarmor_Chestplate || stack.getItem() == ModItems.endarmor_Boots) {
			return References.MOD_ID + ":textures/models/armor/EndArmor_1.png";
		}else if(stack.getItem() == ModItems.endarmor_Leggings){
			return References.MOD_ID + ":textures/models/armor/EndArmor_2.png";
		}else{
			return null;
		}
	}

}