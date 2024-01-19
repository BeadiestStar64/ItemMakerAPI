package com.github.BeadiesStar64.Plugin;

import org.bukkit.Material;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class AbstractMake implements Make{
    @Override
    public void makeInitialize() {

    }

    @Override
    public void makeItemName() {

    }

    @Override
    public void makeItemLore() {

    }

    @Override
    public void makeItemEnchanting() {

    }

    @Override
    public void makeItemAttribute() {

    }

    @Override
    public void makeItemFlag() {

    }

    @Override
    public ItemStack makeItem(Material material) {
        return null;
    }

    @Override
    public ItemStack makeItem(ItemStack item) {
        return null;
    }

    @Override
    public void setItemName(String name) {

    }

    @Override
    public void setItemLore(List<String> lore) {

    }

    @Override
    public void setItemEnchanting(Enchantment[] enchantments, int[] enchantmentLevels, boolean[] allowOverEnchanting) {

    }

    @Override
    public void setItemAttribute(String[] attributeKeys, double[] amounts, AttributeModifier.Operation[] operations, EquipmentSlot[] slots) {

    }

    @Override
    public void setItemFlag(ItemFlag[] flag) {

    }

    @Override
    public boolean checkEnchantingError(Enchantment[] enchantments, int[] enchantmentLevels, boolean[] allowOverEnchanting) {
        return false;
    }

    @Override
    public boolean checkAttribute(String[] attributeKeys, double[] amounts, AttributeModifier.Operation[] operations, EquipmentSlot[] slots) {
        return false;
    }
}
