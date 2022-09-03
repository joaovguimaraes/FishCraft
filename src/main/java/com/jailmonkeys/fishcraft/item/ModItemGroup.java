package com.jailmonkeys.fishcraft.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup FISHCRAFT_GROUP = new ItemGroup("FishCraftTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WORM.get());
        }
    };
}
