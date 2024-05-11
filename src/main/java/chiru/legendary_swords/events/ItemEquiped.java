package chiru.legendary_swords.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.checkerframework.checker.units.qual.Speed;

public class ItemEquiped implements Listener {

    @EventHandler
    public void onItemHold(PlayerItemHeldEvent event) {
        Player player = event.getPlayer();
        int newSlot = event.getNewSlot();
        ItemStack heldItem = player.getInventory().getItem(newSlot);
        // Now you have the item that the player is holding in their hand
        if (heldItem != null) {
            // Do something with the held item

            //Upgraded Diamond Sword Effects
            if (heldItem.getItemMeta().getDisplayName().equalsIgnoreCase( ChatColor.AQUA + "" + ChatColor.BOLD + "Diamond Sword")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, Integer.MAX_VALUE, 0));
            }
            else {
                player.removePotionEffect(PotionEffectType.ABSORPTION);
            }

            //Upgraded Gold Sword Effects
            if (heldItem.getItemMeta().getDisplayName().equalsIgnoreCase( ChatColor.GOLD + "" + ChatColor.BOLD + "Gold Sword")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 0));
            }
            else {
                player.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
            }

            //Redstone Sword Effects
            if (heldItem.getItemMeta().getDisplayName().equalsIgnoreCase( ChatColor.RED + "" + ChatColor.BOLD + "Redstone Sword")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
            }
            else {
                player.removePotionEffect(PotionEffectType.SPEED);
            }

            //Emerald Sword Effects
            if (heldItem.getItemMeta().getDisplayName().equalsIgnoreCase( ChatColor.GREEN + "" + ChatColor.BOLD + "Emerald Sword")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, Integer.MAX_VALUE, 0));
                player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, Integer.MAX_VALUE, 0));
            }
            else {
                player.removePotionEffect(PotionEffectType.LUCK);
                player.removePotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE);
            }
        }
    }
}