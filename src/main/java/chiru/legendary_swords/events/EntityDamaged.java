package chiru.legendary_swords.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EntityDamaged implements Listener {

    private Plugin plugin; // Field to store the plugin instance
    private Map<UUID, Long> cooldowns = new HashMap<>(); // Map to store player cooldowns

    public EntityDamaged(Plugin plugin) {
        this.plugin = plugin;
    }

    // Lightning Sword Cooldown
    private final long cooldownTimeMillis = 2000; // 5 seconds cooldown

    @EventHandler
    public void onEntityDamaged(EntityDamageByEntityEvent event) {
        if (event.getCause() != EntityDamageEvent.DamageCause.ENTITY_ATTACK) {
            return; // Ignore non-attack damages
        }

        if (!(event.getDamager() instanceof Player)) {
            return; // Ignore if the damager is not a player
        }

        // Player who attacks
        Player damager = (Player) event.getDamager();

        // Upgraded Diamond Sword
        if (damager.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "" + ChatColor.BOLD + "Diamond Sword")) {
            if (damager.isSneaking()) {
                if (checkCooldown(damager)) {
                    // Strike Lightning
                    event.getEntity().getWorld().strikeLightning(event.getEntity().getLocation());
                    // Set cooldown
                    setCooldown(damager);
                } else {
                    // Player is still on cooldown
                    damager.sendMessage(ChatColor.RED + "Ability is on cooldown.");
                }
            }
        }
    }

    // Check if player is on cooldown
    private boolean checkCooldown(Player player) {
        if (!cooldowns.containsKey(player.getUniqueId())) {
            return true; // Player not on cooldown
        }

        long cooldownEnd = cooldowns.get(player.getUniqueId());
        return System.currentTimeMillis() > cooldownEnd;
    }

    // Set player cooldown
    private void setCooldown(Player player) {
        long cooldownEnd = System.currentTimeMillis() + cooldownTimeMillis;
        cooldowns.put(player.getUniqueId(), cooldownEnd);

        // Schedule cooldown removal
        Bukkit.getScheduler().runTaskLater(plugin, () -> {
            cooldowns.remove(player.getUniqueId());
            player.sendMessage(ChatColor.GREEN + "Ability is now not on cooldown.");
        }
        , cooldownTimeMillis / 1000 * 20);
    }
}
