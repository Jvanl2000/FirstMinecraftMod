package net.joshua.firstmod.block.custom;

import net.joshua.firstmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class HeatBlock extends Block {
    public HeatBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(@NotNull Level pLevel, @NotNull BlockPos pPos,
                       @NotNull BlockState pState, Entity pEntity) {
        if (pEntity instanceof LivingEntity) {
            if (!((LivingEntity) pEntity).isHolding(new ItemStack(ModItems.ALEXANDRITE.get()).getItem())) {
                pEntity.hurt(pLevel.damageSources().hotFloor(), 2.0F);
            }
        }
        }

}
