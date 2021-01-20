package com.github.beastyboo.jailbeasted.core;

import org.bukkit.plugin.java.JavaPlugin;

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
        return core.getJailAPI();
    }

}
