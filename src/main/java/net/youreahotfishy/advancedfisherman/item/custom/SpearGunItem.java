package net.youreahotfishy.advancedfisherman.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SpearGunItem extends Item {

    public SpearGunItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            output(user);
            user.getItemCooldownManager().set(this, 20);
        }

        return super.use(world, user, hand);
    }

    private void output(PlayerEntity player) {
        player.sendMessage(Text.literal("Hello World!"));
    }
}