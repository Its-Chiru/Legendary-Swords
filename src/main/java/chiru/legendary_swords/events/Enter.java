package chiru.legendary_swords.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.nio.charset.StandardCharsets;

public class Enter implements Listener {
    @EventHandler
    public void playerEntered(PlayerJoinEvent event){
        Player player = event.getPlayer();

        String texturePack = "https://download.mc-packs.net/pack/551fb44d14722518f2c3cde5949f4c274008547a.zip";

        player.setResourcePack(texturePack);
    }

}
