package net.youreahotfishy.advancedfisherman.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.youreahotfishy.advancedfisherman.MainClass;
import net.youreahotfishy.advancedfisherman.item.ModItemGroup;

public class ModBlocks {

    //Ore Blocks
    public static final Block STEEL_ORE = registerBlock("steel_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.ADVANCEDFISHERMAN);

    public static final Block DEEPSLATE_STEEL_ORE = registerBlock("deepslate_steel_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(4, 7)), ModItemGroup.ADVANCEDFISHERMAN);

    //Blocks Added
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ADVANCEDFISHERMAN);


    //Block Registry
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MainClass.MOD_ID, name), block);
    }

    //Block Item Registry
    private  static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MainClass.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    //Registers Blocks In MainClass
    public static void registerModBlocks() {
        MainClass.LOGGER.debug("Registering Mod Blocks for " + MainClass.MOD_ID);
    }
}
