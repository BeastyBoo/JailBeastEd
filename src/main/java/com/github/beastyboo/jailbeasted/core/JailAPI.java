package com.github.beastyboo.jailbeasted.core;

import com.github.beastyboo.jailbeasted.crime.CrimeManager;
import com.github.beastyboo.jailbeasted.file.CustomItemManager;
import com.github.beastyboo.jailbeasted.inmate.InmateManager;
import com.github.beastyboo.jailbeasted.jail.JailManager;
import com.github.beastyboo.jailbeasted.port.CrimeRepo;
import com.github.beastyboo.jailbeasted.port.CustomItemRepo;
import com.github.beastyboo.jailbeasted.port.InmateRepo;
import com.github.beastyboo.jailbeasted.port.JailRepo;

public class JailAPI {

    private final JailCore core;

    private CustomItemRepo customItemManager;
    private CrimeRepo crimeManager;
    private InmateRepo inmateManager;
    private JailRepo jailManager;

    public JailAPI(JailCore core) {
        this.core = core;
    }

    protected void initializeManagers() {
        customItemManager = new CustomItemManager(core, this);
        crimeManager = new CrimeManager(core, this);
        inmateManager = new InmateManager(core, this);
        jailManager = new JailManager(core, this);
    }

    protected void start() {

    }



}
