package org.me.pyke.nowindcharge;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoWindCharge extends JavaPlugin {

    private static NoWindCharge instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new WindChargeListener(this), this);

        getLogger().info(ChatColor.translateAlternateColorCodes('&', getConfig().getString("startup-message", "&aNoWindCharge has been enabled!")));
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.translateAlternateColorCodes('&', getConfig().getString("shutdown-message", "&cNoWindCharge has been disabled!")));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("nowindcharge")) {
            if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
                if (!sender.hasPermission("nowindcharge.reload")) {
                    sender.sendMessage(formatMessage(getConfig().getString("no-permission-message", "&cYou don't have permission to use this command!")));
                    return true;
                }

                reloadConfig();
                sender.sendMessage(formatMessage(getConfig().getString("reload-message", "&aConfiguration reloaded!")));
                return true;
            }
        }
        return false;
    }

    public static NoWindCharge getInstance() {
        return instance;
    }

    public String formatMessage(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
