package com.sahil.hackcraft.item;

import com.sahil.hackcraft.Hackcraft;
import com.sahil.hackcraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CUSTOM_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(
            Hackcraft.MOD_ID, "custom_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CURRY))
                    .displayName(Text.translatable("itemgroup.hackcraft.custom_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.IPAD);
                        entries.add(ModItems.PHONE);
                        entries.add(ModItems.COMPUTER);
                        entries.add(ModItems.CURRY);
                        entries.add(ModItems.BURNT_CURRY);
                        entries.add(ModBlocks.CURRY_BLOCK);
                        entries.add(ModBlocks.CURRY_ORE_BLOCK);
                    })


                    .build());


    public static void registerItemGroups(){
        Hackcraft.LOGGER.info("Register Item Groups for"+Hackcraft.MOD_ID);
    }
}
