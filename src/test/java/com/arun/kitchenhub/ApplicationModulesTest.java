package com.arun.kitchenhub;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ApplicationModulesTest {

    @Test
    void verifiesApplicationModules() {
        ApplicationModules modules =
                ApplicationModules.of(KitchenHubApplication.class);
        modules.verify();
    }
}
