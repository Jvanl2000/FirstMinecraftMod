package net.joshua.firstmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class HellstoneBlock extends Block {
    public HellstoneBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(@NotNull Level pLevel, @NotNull BlockPos pPos,
                       @NotNull BlockState pState, @NotNull Entity pEntity) {
        if (pEntity instanceof Player player) {
            if (!player.getItemBySlot(EquipmentSlot.FEET).getItem().equals(Items.DIAMOND_BOOTS)) {
                player.hurt(pLevel.damageSources().hotFloor(), 2.0f);

            }
        }
        }
}
