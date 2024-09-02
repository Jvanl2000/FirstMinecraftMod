package net.joshua.firstmod.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class CloakRelicItem extends Item {
    public CloakRelicItem(Properties pProperties) {
        super(pProperties);
    }

    boolean activeEffect = false;
    int counter = 0;

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, Player pPlayer,
                                                           @NotNull InteractionHand pUsedHand) {
        pPlayer.getCooldowns().addCooldown(this, 600);

        pPlayer.getItemInHand(pUsedHand).hurtAndBreak(1, pPlayer, EquipmentSlot.MAINHAND);

        pLevel.playSound(pPlayer, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), SoundEvents.AMETHYST_CLUSTER_BREAK,
                SoundSource.PLAYERS, 1, 1);

        activeEffect = true;
        counter = 600;

        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
    }



    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level pLevel, @NotNull Entity pEntity, int pSlotId, boolean pIsSelected) {
        if (!pLevel.isClientSide) {
            if (counter > 0) {
                counter--;
                if (counter == 0) {
                    if (pEntity instanceof Player player) {
                        player.getCooldowns().addCooldown(this, 600);
                    }
                }
            }
            else
                activeEffect = false;
            if (pEntity instanceof Player player) {
                if (!activeEffect) {
                    if (player.isInvisible())
                        player.setInvisible(false);
                } else {
                    if (player.getMainHandItem() == stack && !player.isSpectator()) {
                        player.setInvisible(true);
                    } else {
                        counter = 0;
                        activeEffect = false;
                        if (player.isInvisible())
                            player.setInvisible(false);
                    }
                }
            }
        }
    }
}