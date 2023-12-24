package org.minecraft.sitplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.minecraft.sitplugin.commands.SitCommand;

public final class SitPlugin extends JavaPlugin {

    private static SitPlugin instance;
    @Override
    public void onEnable() {
        if (instance == null)
        {
            instance = this;
        }

        new SitCommand();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static SitPlugin GetInstance()
    {
        return  instance;
    }
}
