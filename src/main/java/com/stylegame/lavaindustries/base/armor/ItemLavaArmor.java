package com.stylegame.lavaindustries.base.armor;

import com.stylegame.lavaindustries.LavaIndustries;
import com.stylegame.lavaindustries.register.ItemReg;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import javax.annotation.Nullable;
import java.util.List;

public class ItemLavaArmor extends ItemArmor {
    public ItemLavaArmor(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
    }

    public static ItemArmor.ArmorMaterial LAVAINGOT_ARMOR = EnumHelper.addArmorMaterial("lavaindustries:lavaingotarmor", "lavaindustries:lavaingotarmor", 500, new int[]{5, 7, 6, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.0F).setRepairItem(new ItemStack((ItemReg.LavaIngot)));

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (player.inventory.armorItemInSlot(0) != null &&
                player.inventory.armorItemInSlot(1) != null &&
                player.inventory.armorItemInSlot(2) != null &&
                player.inventory.armorItemInSlot(3) != null) {
            if (player.inventory.armorItemInSlot(0).getItem() == ItemReg.BOOTS &&
                    player.inventory.armorItemInSlot(1).getItem() == ItemReg.LEGS &&
                    player.inventory.armorItemInSlot(2).getItem() == ItemReg.CHESTPLATE &&
                    player.inventory.armorItemInSlot(3).getItem() == ItemReg.HEAD) {
                player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 50, 0));
                {
                    if (player.getActivePotionEffect(MobEffects.FIRE_RESISTANCE) == null) {
                        player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 50, 0));
                    }
                    if (world.getWorldTime() % 50 > 0) {
                        return;
                    }
                    player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 50, 0));
                }
            }
        }
    }
}