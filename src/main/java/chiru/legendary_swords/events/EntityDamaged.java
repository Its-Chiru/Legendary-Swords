package chiru.legendary_swords.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EntityDamaged implements Listener {

    @EventHandler
    public void onEntityDamaged(EntityDamageByEntityEvent event) {

        if (event.getCause() != EntityDamageEvent.DamageCause.ENTITY_ATTACK) {
            return; // Ignore non-attack damages
        }

        if (!(event.getDamager() instanceof Player)) {
            return; // Ignore if the damager is not a player
        }

        //Player Who Atacks
        Player damager = (Player) event.getDamager();


        //Upgraded Diamond Sword
        if (damager.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "" + ChatColor.BOLD + "Diamond Sword")) {
            if(damager.isSneaking()){
                //Struck Lighting
                System.out.println("Hitted Smth With The Sword And tried to summon lighting");
                event.getEntity().getWorld().strikeLightning(event.getEntity().getLocation());
            }
        }
    }
}
