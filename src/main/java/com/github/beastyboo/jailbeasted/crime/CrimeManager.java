package com.github.beastyboo.jailbeasted.crime;

import com.github.beastyboo.jailbeasted.core.JailAPI;
import com.github.beastyboo.jailbeasted.core.JailCore;
import com.github.beastyboo.jailbeasted.port.CrimeRepo;

public class CrimeManager implements CrimeRepo {

    private final JailCore core;
    private final JailAPI api;

    public CrimeManager(JailCore core, JailAPI api) {
        this.core = core;
        this.api = api;
    }

}
