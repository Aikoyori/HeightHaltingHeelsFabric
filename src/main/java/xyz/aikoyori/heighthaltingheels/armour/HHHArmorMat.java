package xyz.aikoyori.heighthaltingheels.armour;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class HHHArmorMat implements ArmorMaterial {
    /*
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }),*/
    @Override
    public int getDurability(EquipmentSlot slot) {
        return switch (slot)
                {
                    case HEAD -> 265;
                    case CHEST -> 340;
                    case LEGS -> 325;
                    case FEET -> 295;
                    default -> 1;
                };
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return switch (slot)
                {
                    case HEAD -> 2;
                    case CHEST -> 5;
                    case LEGS -> 6;
                    case FEET -> 2;
                    default -> 2;
                };
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(new ItemConvertible[]{Items.IRON_INGOT});
    }

    @Override
    public String getName() {
        return "long_fall";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
