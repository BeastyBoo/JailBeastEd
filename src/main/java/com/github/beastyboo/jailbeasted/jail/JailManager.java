package com.github.beastyboo.jailbeasted.jail;

import com.github.beastyboo.jailbeasted.core.JailAPI;
import com.github.beastyboo.jailbeasted.core.JailCore;
import com.github.beastyboo.jailbeasted.port.JailRepo;

public class JailManager implements JailRepo {

    private final JailCore core;
    private final JailAPI api;

    public JailManager(JailCore core, JailAPI api) {
        this.core = core;
        this.api = api;
    }
}
