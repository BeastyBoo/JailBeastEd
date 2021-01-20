package com.github.beastyboo.jailbeasted.core;

import org.bukkit.plugin.java.JavaPlugin;

public class JailCore {

    private final JavaPlugin plugin;
    private JailAPI jailAPI;

    public JailCore(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    void load() {
        jailAPI = new JailAPI(this);
        //Everything that uses API's go under here. If it don't use -> constructor

        jailAPI.initializeManagers();
        jailAPI.start();

    }

    void close() {

    }

    public JavaPlugin getPlugin() {
        return plugin;
    }

    public JailAPI getJailAPI() {
        return jailAPI;
    }
}
