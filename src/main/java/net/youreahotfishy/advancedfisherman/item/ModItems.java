package net.youreahotfishy.advancedfisherman.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.youreahotfishy.advancedfisherman.MainClass;
import net.youreahotfishy.advancedfisherman.item.custom.ModBleedingSpearItem;
import net.youreahotfishy.advancedfisherman.item.custom.SpearGunItem;

public class ModItems {

    //Items
    public static final Item RAW_STEEL = registerItem("raw_steel",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVANCEDFISHERMAN)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ADVANCEDFISHERMAN)));

    //Tools
    public static final Item SPEAR_GUN = registerItem("spear_gun",
            new SpearGunItem(new FabricItemSettings().group(ModItemGroup.ADVANCEDFISHERMAN).maxCount(1)));

    public static final Item SPEAR = registerItem("spear",
            new ModBleedingSpearItem(ModToolMaterials.STEEL, 6, 0f,
                    new FabricItemSettings().group(ModItemGroup.ADVANCEDFISHERMAN).maxCount(1)));


    //Item Registry
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MainClass.MOD_ID, name), item);
    }

    //Registers Items in MainClass
    public static void registerModItems() {
        MainClass.LOGGER.debug("Registering Mod Items for " + MainClass.MOD_ID);
    }
}
