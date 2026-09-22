package com.arun.kitchenhub;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

public class ArchitectureDocumentationTest {

    @Test
    void generateDocumentation() {

        var modules = ApplicationModules.of(KitchenHubApplication.class);

        new Documenter(modules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml();
    }
}
