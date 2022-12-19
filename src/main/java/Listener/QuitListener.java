package Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    public static void OnQuit(PlayerQuitEvent e){
        e.setQuitMessage("§7[§c-§7] §c" + e.getPlayer().getName());
    }
}
