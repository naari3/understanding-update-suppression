package net.naari3.upsp.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PoweredRailBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.naari3.upsp.Main;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PoweredRailBlock.class)
public class PoweredRailUpdateCount {
	@Inject(at = @At("HEAD"), method = "updateBlockState")
	private void updateBlockState(BlockState state, World world, BlockPos pos, Block neighbor, CallbackInfo info) {
		Main.increaseCount();
	}
}
