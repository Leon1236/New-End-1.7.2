package com.leon1236.newend.items;
 
import net.minecraft.item.Item;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;
 
public class IC_EndDustSmall extends Item
{
    public IC_EndDustSmall(){
    	
        maxStackSize = 64;
		setCreativeTab(NewEnd_Main.Tab_newend); //Place in creative tabs
		setUnlocalizedName(Strings.IC_EndDustSmall_NAME); //Name of the block in lang file
		setTextureName(References.MOD_ID + ":IC_EndDustSmall"); //Texture for the item
    }
}
    
   



