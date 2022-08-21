package xyz.aikoyori.heighthaltingheels.mixin;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.aikoyori.heighthaltingheels.Heighthaltingheels;

@Mixin(LivingEntity.class)
public class FallDistanceMixin {
    @Inject(method = "computeFallDamage",at = @At("RETURN"),cancellable = true)
    void fallDamagePutForthByLongFallBootsAreNegatedASD(float fallDistance, float damageMultiplier, CallbackInfoReturnable<Integer> cir){
        LivingEntity liv = ((LivingEntity)(Object)(this));
        if(liv.getEquippedStack(EquipmentSlot.FEET).getItem()== Heighthaltingheels.LONG_FALL_BOOTS)
        {
            cir.setReturnValue(0);
        }
    }
}
