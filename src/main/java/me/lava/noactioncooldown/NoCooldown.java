package me.lava.noactioncooldown;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;

public class NoCooldown implements Listener {
    @EventHandler
    public void onBlockDamage(BlockDamageEvent event) {
        event.setInstaBreak(true);
    }
}