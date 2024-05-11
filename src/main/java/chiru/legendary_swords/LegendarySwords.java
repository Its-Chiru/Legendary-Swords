package chiru.legendary_swords;

import chiru.legendary_swords.events.Enter;
import chiru.legendary_swords.events.EntityDamaged;
import chiru.legendary_swords.events.ItemEquiped;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class LegendarySwords extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GREEN + "******************************************");
        System.out.println(ChatColor.GREEN + "*            Legendary Swords            *");
        System.out.println(ChatColor.GREEN + "*                                        *");
        System.out.println(ChatColor.GREEN + "*            Created By Chiru            *");
        System.out.println(ChatColor.GREEN + "*                                        *");
        System.out.println(ChatColor.GREEN + "******************************************");
        System.out.println(ChatColor.GREEN + "Legendary Swords, has been initialized!");
        System.out.println(ChatColor.GREEN + "******************************************");

        //Register Recipes
        CustomRecipes.register(this);

        //Register Events
        getServer().getPluginManager().registerEvents(new ItemEquiped(), this);
        getServer().getPluginManager().registerEvents(new EntityDamaged(), this);
        getServer().getPluginManager().registerEvents(new Enter(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.RED + "******************************************");
        System.out.println(ChatColor.RED + "*            Legendary Swords            *");
        System.out.println(ChatColor.RED + "*                                        *");
        System.out.println(ChatColor.RED + "*            Created By Chiru            *");
        System.out.println(ChatColor.RED + "*                                        *");
        System.out.println(ChatColor.RED + "******************************************");
        System.out.println(ChatColor.RED + "Legendary Swords, has been shutdown!");
        System.out.println(ChatColor.RED + "******************************************");
    }
}
