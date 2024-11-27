package net.prism.billysItems.item;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.prism.billysItems.BillysItems;

public class ModCreativeModeTabs {
    Minecraft minecraft = Minecraft.getInstance();
    Player player = minecraft.player;
    
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BillysItems.MODID);
    
    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SWORD2.get()))
                    .title(Component.translatable("creative_tab.billy_items.mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                    
                    pOutput.accept(ModItems.SWORD2.get());
                    pOutput.accept(ModItems.HHAMR.get());
                    
                    })
                    .build());
    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
