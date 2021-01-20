package com.github.beastyboo.jailbeasted.file;

import com.github.beastyboo.jailbeasted.core.JailAPI;
import com.github.beastyboo.jailbeasted.core.JailCore;
import com.github.beastyboo.jailbeasted.port.CustomItemRepo;

public class CustomItemManager implements CustomItemRepo {

    private final JailCore core;
    private final JailAPI api;

    public CustomItemManager(JailCore core, JailAPI api) {
        this.core = core;
        this.api = api;
    }

}
