package net.prism.billysItems;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.simple.SimpleChannel;
import net.prism.billysItems.block.ModBlocks;
import net.prism.billysItems.item.ModCreativeModeTabs;
import net.prism.billysItems.item.ModItems;

import java.util.UUID;

@Mod(BillysItems.MODID)
public class BillysItems {
    public static final String MODID = "billy_items";
    
    public static SimpleChannel packetInstance;
    
    public BillysItems() {
        
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        ModCreativeModeTabs.register(modEventBus);
        
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        
        
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::Setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::intermodStuff);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onLoadComplete);
        modEventBus.addListener(this::commonSetup);
        
        
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void commonSetup(final FMLCommonSetupEvent event) {
    }
    
    private void onLoadComplete(FMLLoadCompleteEvent event) {
    
    }
    
    private void intermodStuff(InterModEnqueueEvent event) {
    
    }
    
    private void Setup(final FMLCommonSetupEvent event) {
    
        
    }
    
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
    
    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = BillysItems.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        
        }
        
        @SubscribeEvent
        public static void onRegisterKeyMappings(RegisterKeyMappingsEvent event) {
        
        }
    }
}