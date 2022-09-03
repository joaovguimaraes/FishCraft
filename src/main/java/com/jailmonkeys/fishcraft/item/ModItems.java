package com.jailmonkeys.fishcraft.item;

import com.jailmonkeys.fishcraft.FishCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FishCraft.MOD_ID);


    public static final RegistryObject<Item> WORM = ITEMS.register("worm",
            () -> new Item(new Item.Properties().tab(ModItemGroup.FISHCRAFT_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
