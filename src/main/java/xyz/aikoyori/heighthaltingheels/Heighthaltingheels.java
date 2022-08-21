package xyz.aikoyori.heighthaltingheels;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.aikoyori.heighthaltingheels.armour.HHHArmorMat;

public class Heighthaltingheels implements ModInitializer {
    public static final String MOD_ID = "heighthaltingheels";
    public static final ArmorMaterial HHH_ARMOR_MAT = new HHHArmorMat();
    public static final Item LONG_FALL_BOOTS = new ArmorItem(HHH_ARMOR_MAT, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.TOOLS));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM,new Identifier(MOD_ID,"long_fall_boots"),LONG_FALL_BOOTS);
    }
}
