package com.stylegame.lavaindustries.base.armor;

import com.stylegame.lavaindustries.register.ItemReg;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemLavaArmor extends ItemArmor
{
    public ItemLavaArmor(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    public static ItemArmor.ArmorMaterial armorMaterial = EnumHelper.addArmorMaterial("lavaindustries:lavaingotarmor", "lavaindustries:lavaingotarmor", 1030, new int[]{1, 2, 3, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F).setRepairItem(new ItemStack((ItemReg.LavaIngot)));
}
