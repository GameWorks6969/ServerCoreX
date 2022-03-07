package xyz.majongtech.scx;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class loggerUtil extends JavaPlugin implements Listener {
    private static final String PREFIX = "[ServerCoreX]";

    public static void debug(String msg) {
        logExtra("Debug - ", msg);
    }

    public static void error(String msg) {
        logExtra("Error - ", msg);
    }

    public static void warn(String msg) {
        logExtra("Warning - ", msg);
    }

    public static void info(String msg) {
        logExtra("Info - ", msg);
    }

    public static void logExtra(String extra, String msg) {
        System.out.println(PREFIX + extra + msg);
    }

    public static void log(String msg) {
        System.out.println(PREFIX + " : " + msg);
    }
}
