package com.sahil.hackcraft.item;

import com.sahil.hackcraft.Hackcraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COMPUTER = registerItem("computer", new Item(new Item.Settings()));
    public static final Item PHONE = registerItem("phone", new Item(new Item.Settings()));
    public static final Item IPAD = registerItem("ipad", new Item(new Item.Settings()));
    public static final Item CURRY = registerItem("curry", new Item(new Item.Settings()));
    public static final Item BURNT_CURRY = registerItem("burnt_curry", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Hackcraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Hackcraft.LOGGER.info("Registering Mod Items for " + Hackcraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(COMPUTER);
            entries.add(PHONE);
            entries.add(IPAD);
            entries.add(CURRY);
            entries.add(BURNT_CURRY);
        });
        }
    }
