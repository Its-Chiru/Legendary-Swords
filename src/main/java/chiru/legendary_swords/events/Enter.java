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

        String texturePack = "https://download.mc-packs.net/pack/63af22dfb70aab544ae338f8687bf17d8423761a.zip";

        player.setResourcePack(texturePack);
    }

}
