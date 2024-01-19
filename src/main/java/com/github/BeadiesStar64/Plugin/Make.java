package com.github.BeadiesStar64.Plugin;

import org.bukkit.Material;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface Make {

    void makeInitialize();
    void makeItemName();
    void makeItemLore();
    void makeItemEnchanting();
    void makeItemAttribute();
    void makeItemFlag();

    ItemStack makeItem(Material material);
    ItemStack makeItem(ItemStack item);

    void setItemName(String name);
    void setItemLore(List<String> lore);
    void setItemEnchanting(Enchantment[] enchantments, int[] enchantmentLevels, boolean[] allowOverEnchanting);
    void setItemAttribute(String[] attributeKeys, double[] amounts, AttributeModifier.Operation[] operations, EquipmentSlot[] slots);
    void setItemFlag(ItemFlag[] flag);

    boolean checkEnchantingError(Enchantment[] enchantments, int[] enchantmentLevels, boolean[] allowOverEnchanting);
    boolean checkAttribute(String[] attributeKeys, double[] amounts, AttributeModifier.Operation[] operations, EquipmentSlot[] slots);
}
