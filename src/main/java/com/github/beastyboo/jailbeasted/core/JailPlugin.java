package com.github.beastyboo.jailbeasted.core;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class JailPlugin extends JavaPlugin {

    private JailCore core;

    @Override
    public void onEnable() {
        core = new JailCore(this);
        core.load();
    }

    @Override
    public void onDisable() {
        core.close();
        core = null;
    }

    public JailAPI getAPI(){
        if(core.getJailAPI() == null) {
            this.getLogger().log(Level.WARNING, "Jail Beast Edition has not loaded yet!!");
        }
        return core.getJailAPI();
    }

}
