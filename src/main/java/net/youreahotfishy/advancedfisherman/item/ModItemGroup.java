package net.youreahotfishy.advancedfisherman.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.youreahotfishy.advancedfisherman.MainClass;

public class ModItemGroup {
    public static final ItemGroup ADVANCEDFISHERMAN = FabricItemGroupBuilder.build(
            new Identifier(MainClass.MOD_ID, "advancedfisherman"), () -> new ItemStack(ModItems.RAW_STEEL));
}
