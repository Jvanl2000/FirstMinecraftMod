package net.joshua.firstmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ColdBlock extends Block {
    public ColdBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(@NotNull Level pLevel, @NotNull BlockPos pPos,
                       @NotNull BlockState pState, @NotNull Entity pEntity) {
        if (pEntity instanceof Player player) {
            if (pLevel.hasNeighborSignal(pPos)) {
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1, 255, false, false, false), player);
                player.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1, 255, false, false, false), player);
                player.setPos((pPos.getX() + 0.5), (pPos.getY() + 1), (pPos.getZ() + 0.5));
                player.setOnGround(false);
            }
        }
    }



}
