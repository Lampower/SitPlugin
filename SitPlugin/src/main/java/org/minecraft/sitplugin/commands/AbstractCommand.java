package org.minecraft.sitplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.minecraft.sitplugin.SitPlugin;

public abstract class AbstractCommand implements CommandExecutor {

    public AbstractCommand(String commandName)
    {
        PluginCommand pluginCommand = SitPlugin.GetInstance().getCommand(commandName);
        if (pluginCommand != null)
        {
            pluginCommand.setExecutor(this);
        }
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        execute(sender, label, args);
        return true;
    }

    public abstract void execute(CommandSender sender, String label, String[] args);
}
