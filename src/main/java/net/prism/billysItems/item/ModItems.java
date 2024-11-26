package net.prism.billysItems.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.prism.billysItems.BillysItems;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BillysItems.MODID);
    
    public static final RegistryObject<Item> SWORD2 = ITEMS.register("sword_2",
            ()-> new SwordItem(Tiers.NETHERITE, 25, 2, new Item.Properties().defaultDurability((int) Float.POSITIVE_INFINITY)));
    
    public static final RegistryObject<Item> HHAMR = ITEMS.register("warforged_hammer",
            ()-> new SwordItem(Tiers.NETHERITE, 25, 2, new Item.Properties().defaultDurability((int) Float.POSITIVE_INFINITY)));
    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
