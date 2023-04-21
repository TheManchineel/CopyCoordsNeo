package net.newspawn.copycoordsneo;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("cc").setExecutor(new CommandCc());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}