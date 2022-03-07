package xyz.majongtech.servercorex.commands.gamemode;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.majongtech.scx.loggerUtil;

public class gmsp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        try {
            Player p = (Player) sender;
            p.setGameMode(GameMode.SPECTATOR);
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&bS&3C&9X&8] &aSet you gamemode to &eSpectator&a!"));
        } catch (Exception e) {
            loggerUtil.error("Uh Oh! An error occurred in running the command : GMSP!");
            loggerUtil.error("Please report this to GameWorks!");
        }
        return true;
    }
}
