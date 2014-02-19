package com.leon1236.newend.items;
 
import net.minecraft.item.Item;

import com.leon1236.newend.NewEnd_Main;
import com.leon1236.newend.lib.References;
import com.leon1236.newend.lib.Strings;
 
public class IC_EndCasing extends Item
{
    public IC_EndCasing(){
    	
        maxStackSize = 64;
		setCreativeTab(NewEnd_Main.Tab_newend); //Place in creative tabs
		setUnlocalizedName(Strings.IC_EndCasing_NAME); //Name of the block in lang file
		setTextureName(References.MOD_ID + ":IC_EndCasing"); //Texture for the item
    }
}
    
   


