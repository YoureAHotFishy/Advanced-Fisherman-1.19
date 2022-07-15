package net.youreahotfishy.advancedfisherman.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.youreahotfishy.advancedfisherman.MainClass;

public class ModItems {

    public static final Item RAW_STEEL = registerItem("raw_steel",
            new Item(new FabricItemSettings().group(ModItemGroup.RAW_STEEL)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MainClass.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MainClass.LOGGER.debug("Registering Mod Items for " + MainClass.MOD_ID);
    }
}
