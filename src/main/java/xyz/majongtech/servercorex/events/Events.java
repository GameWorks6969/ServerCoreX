package xyz.majongtech.servercorex.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public final class Events implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        if (player.hasPlayedBefore()){
            e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&8[&a+&8] &aWelcome back, &e" + player.getDisplayName() + "&a!"));
        } else {
            e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', "&8[&a+&8] &aWelcome, &e" + player.getDisplayName() + "&a!"));
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.translateAlternateColorCodes('&', "&8[&c-&8] &a&cGoodBye,&e" + player.getDisplayName() + "&c!"));;
    }
}