package com.github.beastyboo.jailbeasted.inmate;

import com.github.beastyboo.jailbeasted.core.JailAPI;
import com.github.beastyboo.jailbeasted.core.JailCore;
import com.github.beastyboo.jailbeasted.port.InmateRepo;

public class InmateManager implements InmateRepo {

    private final JailCore core;
    private final JailAPI api;

    public InmateManager(JailCore core, JailAPI api) {
        this.core = core;
        this.api = api;
    }

}
