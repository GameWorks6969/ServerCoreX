package xyz.majongtech.servercorex;

// Bukkit
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

// Main
import xyz.majongtech.scx.loggerUtil;

// Event Listeners
import xyz.majongtech.servercorex.events.Events;

// Commands
import xyz.majongtech.servercorex.commands.Feed;
import xyz.majongtech.servercorex.commands.Heal;
import xyz.majongtech.servercorex.commands.God;
import xyz.majongtech.servercorex.commands.gamemode.gma;
import xyz.majongtech.servercorex.commands.gamemode.gmc;
import xyz.majongtech.servercorex.commands.gamemode.gms;
import xyz.majongtech.servercorex.commands.gamemode.gmsp;

public final class ServerCoreX extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Plugin startup logic
        loggerUtil.log("[ServerCoreX] ServerCoreX has started up!");
        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&bServer&3Core&9X &ahas been enabled!"));

        // Commands
        getCommand("feed").setExecutor(new Feed());
        getCommand("heal").setExecutor(new Heal());
        getCommand("god").setExecutor(new God());
        getCommand("gma").setExecutor(new gma());
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmsp").setExecutor(new gmsp());

        // Events
        getServer().getPluginManager().registerEvents(new Events(), this);

        // Test logger
        loggerUtil.logExtra("Test", "Test");
        loggerUtil.log("Test");
        loggerUtil.debug("Test");
        loggerUtil.warn("Test");
        loggerUtil.error("Test");
        loggerUtil.info("Test");
        loggerUtil.log("!DO NOT REPORT THE MESSAGES ABOVE!");
        loggerUtil.log("!IT IS JUST TESTING THE LOGGERUTIL!");
        loggerUtil.log("!IT IS NOT REAL ERRORS!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        loggerUtil.log("[ServerCoreX] ServerCoreX has shut down!");
    }
}