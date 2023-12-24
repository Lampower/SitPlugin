package org.minecraft.sitplugin.eventHandlers;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.minecraft.sitplugin.SitPlugin;
import org.spigotmc.event.entity.EntityDismountEvent;

public class EventHandlers implements Listener {
    public EventHandlers()
    {
        SitPlugin.GetInstance().getServer().getPluginManager().registerEvents(this, SitPlugin.GetInstance());
    }
    @EventHandler
    public void onDismount(EntityDismountEvent evt)
    {
        Entity sit = evt.getEntity();
        if (sit.getCustomName() == "sitPluginCommand")
        {
            sit.remove();
        }
    }
    @EventHandler
    public void onBlockClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Player player = (Player) event.getPlayer();
            Block clicked = event.getClickedBlock();
            if(clicked.getType() == Material.STONE_BRICK_STAIRS) {
            }

            event.setCancelled(true);

        }
    }
}
