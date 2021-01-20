package com.github.beastyboo.jailbeasted.arrest;

import com.github.beastyboo.jailbeasted.core.JailAPI;
import com.github.beastyboo.jailbeasted.core.JailCore;
import com.github.beastyboo.jailbeasted.port.ArrestRepo;

public class ArrestManager implements ArrestRepo {

    private final JailCore core;
    private final JailAPI api;

    public ArrestManager(JailCore core, JailAPI api) {
        this.core = core;
        this.api = api;
    }

}
