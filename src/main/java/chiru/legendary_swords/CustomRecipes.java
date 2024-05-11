package chiru.legendary_swords;

import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomRecipes {
    public static void register(Plugin thisPlugin){

        // Upgraded Diamond Sword
        ItemStack upgraded_diamond = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta upgraded_diamond_meta = upgraded_diamond.getItemMeta();
        upgraded_diamond_meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Diamond Sword");

        // Increase damage (modify as needed)
        upgraded_diamond_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(),"DamageModifier",8.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));

        // Create lore as a list of strings
        List<String> lore = new ArrayList<>();
        lore.add("Upgraded Diamond Sword!");
        lore.add(ChatColor.GRAY+""+ChatColor.ITALIC+"When in hand - ABSORPTION");
        lore.add(ChatColor.GOLD+"Shift + Click - Lighting Strike");

        // Set the lore
        upgraded_diamond_meta.setLore(lore);

        //Custom Model Data
        upgraded_diamond_meta.setCustomModelData(1);

        upgraded_diamond.setItemMeta(upgraded_diamond_meta);

        //Recipe
        ShapedRecipe upgraded_diamond_sword_recipe = new ShapedRecipe(new NamespacedKey(thisPlugin, "upgraded_diamond_sword_recipe"), upgraded_diamond);
        upgraded_diamond_sword_recipe.shape("GDG", "DSD", "GDG");

        // Set ingredients
        upgraded_diamond_sword_recipe.setIngredient('G', Material.GOLD_INGOT);
        upgraded_diamond_sword_recipe.setIngredient('D', Material.DIAMOND);
        upgraded_diamond_sword_recipe.setIngredient('S', Material.DIAMOND_SWORD);

        // Register the recipe
        Bukkit.addRecipe(upgraded_diamond_sword_recipe);



        // Upgraded Gold Sword
        ItemStack upgraded_gold = new ItemStack(Material.IRON_SWORD);
        ItemMeta upgraded_gold_meta = upgraded_gold.getItemMeta();
        upgraded_gold_meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Gold Sword");

        // Increase damage (modify as needed)
        upgraded_gold_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(),"DamageModifier",7.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));

        // Create lore as a list of strings
        List<String> lore2 = new ArrayList<>();
        lore2.add("Upgraded Gold Sword!");
        lore2.add(ChatColor.GRAY+""+ChatColor.ITALIC+"When in hand - FIRE RESISTANCE");

        // Set the lore
        upgraded_gold_meta.setLore(lore2);

        //Custom Model Data
        upgraded_gold_meta.setCustomModelData(1);

        upgraded_gold.setItemMeta(upgraded_gold_meta);

        //Recipe
        ShapedRecipe upgraded_gold_recipe = new ShapedRecipe(new NamespacedKey(thisPlugin, "upgraded_gold_recipe"), upgraded_gold);
        upgraded_gold_recipe.shape("OGO", "GSG", "OGO");

        // Set ingredients
        upgraded_gold_recipe.setIngredient('G', Material.GOLD_INGOT);
        upgraded_gold_recipe.setIngredient('O', Material.OBSIDIAN);
        upgraded_gold_recipe.setIngredient('S', Material.GOLDEN_SWORD);

        // Register the recipe
        Bukkit.addRecipe(upgraded_gold_recipe);


        // Redstone Sword
        ItemStack redstone_s = new ItemStack(Material.IRON_SWORD);
        ItemMeta redstone_s_meta = redstone_s.getItemMeta();
        redstone_s_meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Redstone Sword");

        // Increase damage (modify as needed)
        redstone_s_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(),"DamageModifier",6.5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));

        // Create lore as a list of strings
        List<String> lore3 = new ArrayList<>();
        lore3.add("A Redstone Sword!");
        lore3.add(ChatColor.GRAY+""+ChatColor.ITALIC+"When in hand - SPEED");

        // Set the lore
        redstone_s_meta.setLore(lore3);

        //Custom Model Data
        redstone_s_meta.setCustomModelData(2);

        redstone_s.setItemMeta(redstone_s_meta);

        //Recipe
        ShapedRecipe redstone_s_recipe = new ShapedRecipe(new NamespacedKey(thisPlugin, "redstone_s_recipe"), redstone_s);
        redstone_s_recipe.shape("BRB", "RSR", "BRB");

        // Set ingredients
        redstone_s_recipe.setIngredient('B', Material.REDSTONE_BLOCK);
        redstone_s_recipe.setIngredient('R', Material.REDSTONE);
        redstone_s_recipe.setIngredient('S', Material.WOODEN_SWORD);

        // Register the recipe
        Bukkit.addRecipe(redstone_s_recipe);


        // Emerald Sword
        ItemStack emerald_s = new ItemStack(Material.IRON_SWORD);
        ItemMeta emerald_s_meta = emerald_s.getItemMeta();
        emerald_s_meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Emerald Sword");

        // Increase damage (modify as needed)
        emerald_s_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(),"DamageModifier",7, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));

        // Create lore as a list of strings
        List<String> lore4 = new ArrayList<>();
        lore4.add("A Emerald Sword!");
        lore4.add(ChatColor.GRAY+""+ChatColor.ITALIC+"When in hand - LUCK + HERO");

        // Set the lore
        emerald_s_meta.setLore(lore3);

        //Custom Model Data
        emerald_s_meta.setCustomModelData(3);

        emerald_s.setItemMeta(emerald_s_meta);

        //Recipe
        ShapedRecipe emerald_s_recipe = new ShapedRecipe(new NamespacedKey(thisPlugin, "emerald_s_recipe"), emerald_s);
        emerald_s_recipe.shape("BEB", "ESE", "BEB");

        // Set ingredients
        emerald_s_recipe.setIngredient('B', Material.EMERALD_BLOCK);
        emerald_s_recipe.setIngredient('E', Material.EMERALD);
        emerald_s_recipe.setIngredient('S', Material.WOODEN_SWORD);

        // Register the recipe
        Bukkit.addRecipe(emerald_s_recipe);

    }
}
