package net.prism.billysItems.item.generic;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Random;

public class ItemBase extends Item {
    protected static final Random random = new Random();
    protected boolean isPlaceholder;
    
    public ItemBase(){
        this(ItemBase.getDefaultProperties());
    }
    
    public ItemBase(Properties props) {
        super(props);
        this.isPlaceholder = false;
    }
    
    public static Properties getDefaultProperties() {
        Properties props = new Properties();
        
        props.stacksTo(64);
        props.rarity(Rarity.COMMON);
        
        return props;
    }
    
    public static BlockHitResult rayTrace(Level worldIn, Player player, ClipContext.Fluid fluidMode) {
        return Item.getPlayerPOVHitResult(worldIn, player, fluidMode);
    }
    
    public Item setPlaceholder() {
        this.isPlaceholder = true;
        return this;
    }
    
    public boolean isPlaceholder() {
        return this.isPlaceholder;
    }
    
    @Override
    public Component getName(ItemStack stack) {
        Component superName = super.getName(stack);
        
        if (this.isPlaceholder) {
            if (superName instanceof MutableComponent)
                return ((MutableComponent)superName).withStyle(ChatFormatting.OBFUSCATED);
        }
        
        return superName;
    }
}
