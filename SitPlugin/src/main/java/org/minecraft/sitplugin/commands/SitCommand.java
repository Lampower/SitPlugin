package org.minecraft.sitplugin.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.metadata.MetadataValue;
import org.minecraft.sitplugin.SitPlugin;

public class SitCommand extends  AbstractCommand{
    public SitCommand() {
        super("sit");
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        if (!(sender instanceof Player))
        {
            sender.sendMessage("You are not logged in!");
            return;
        }
        Player player = (Player) sender;
        ArmorStand sit = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, -0.9, 0), EntityType.ARMOR_STAND);
        sit.setCustomName("sitPluginCommand");
        sit.setCustomNameVisible(false);
        sit.setBasePlate(false);
        sit.setSmall(true);
        sit.setGravity(false);
        sit.setInvisible(true);
        sit.addPassenger(player);
    }
}
