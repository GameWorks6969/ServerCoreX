package xyz.majongtech.servercorex.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if (p.isInvulnerable()){
                p.setInvulnerable(false);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&eGodMode &ahas been set to &2True&a!"));
            } else {
                p.setInvulnerable(true);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&eGodMode &ahas been set to &4False&a!"));
            }} else {
            System.out.println("[ServerCoreX] Only a player can run this command.");
        }
        return true;
    }
}
