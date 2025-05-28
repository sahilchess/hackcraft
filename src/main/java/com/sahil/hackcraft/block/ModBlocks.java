package com.sahil.hackcraft.block;

import com.sahil.hackcraft.Hackcraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CURRY_ORE_BLOCK = registerBlock("curry_ore_block",new Block(AbstractBlock.Settings
            .create().strength(3f).sounds(BlockSoundGroup.HONEY)));
    public static final Block CURRY_BLOCK = registerBlock("curry_block",new Block(AbstractBlock.Settings
            .create().strength(3f).sounds(BlockSoundGroup.SLIME)));

    public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Hackcraft.MOD_ID,name),block);
    }


    //helper function in comments
    private static void  registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Hackcraft.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks(){
        Hackcraft.LOGGER.info("Registering Mod Blocks for"+ Hackcraft.MOD_ID);


        //adds blocks to creative menu
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->{
            entries.add(CURRY_ORE_BLOCK);
            entries.add(CURRY_BLOCK);
        });
    }
}
