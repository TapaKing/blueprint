package com.cyrandote.blueprint.controllers;

import com.cyrandote.blueprint.service.TshirtBlueprintService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class BlueprintControllerTest {

    BlueprintController blueprintController;

    @BeforeEach
    void setUp(){
        //blueprintController = new BlueprintController(new TshirtBlueprintService());
    }

    @Test
    @Disabled
    void testCreate(){
        System.out.println(blueprintController.create());
    }
}
