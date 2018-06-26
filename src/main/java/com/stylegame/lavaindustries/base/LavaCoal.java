package com.stylegame.lavaindustries.base;

        import com.stylegame.lavaindustries.LavaIndustries;
        import net.minecraft.item.Item;
        import net.minecraft.item.ItemStack;

public class LavaCoal extends Item{
    public LavaCoal(String name, int maxStackSize){
        this.setRegistryName(name);
        this.setCreativeTab(LavaIndustries.tabLI);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(maxStackSize);
    }
    @Override
    public int getItemBurnTime(ItemStack itemStack) {
        return 12800;
    }
}
