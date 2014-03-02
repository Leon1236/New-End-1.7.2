package com.leon1236.newend.items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;

public class EndArmor extends ItemArmor {

	public EndArmor(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		setCreativeTab(NewEnd_Main.Tab_newend);
		
		if (placement == 0) { //Helmet
			this.setTextureName(References.MOD_ID + ":endarmor_Helmet");
			setUnlocalizedName("endarmor_Helmet");
			}
		else if (placement == 1) { //Chestpate
			this.setTextureName(References.MOD_ID + ":endarmor_Chestplate");
			setUnlocalizedName("endarmor_Chestplate");
			}
		else if (placement == 2) { //Leggings
			this.setTextureName(References.MOD_ID + ":endarmor_Leggings");
			setUnlocalizedName("endarmor_Leggings");
			}
		else if (placement == 3) { //Boots
			this.setTextureName(References.MOD_ID + ":endarmor_Boots");
			setUnlocalizedName("endarmor_Boots");
			}
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if (stack.getItem() == ModItems.endarmor_Helmet || 
			stack.getItem() == ModItems.endarmor_Chestplate || 
			stack.getItem() == ModItems.endarmor_Boots) {
			
			return References.MOD_ID + ":textures/models/armor/EndArmor_1.png";
			}
		
		else if(stack.getItem() == ModItems.endarmor_Leggings){
			
			return References.MOD_ID + ":textures/models/armor/EndArmor_2.png";
			}
		
		else{
			return null;
		}
	}

	//Information on the item
	@Override
    public void addInformation(ItemStack itemStack, EntityPlayer player,
            List infoList, boolean bool)
    {
        int max = itemStack.getMaxDamage();
        infoList.add("Damage Left: " + (max - itemStack.getItemDamage()) + "/" + max);
    }
}