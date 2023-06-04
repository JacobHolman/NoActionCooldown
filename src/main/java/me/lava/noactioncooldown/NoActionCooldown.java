package me.lava.noactioncooldown;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoActionCooldown extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new NoCooldown(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
