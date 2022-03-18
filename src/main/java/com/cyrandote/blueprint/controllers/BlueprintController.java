package com.cyrandote.blueprint.controllers;

import com.cyrandote.blueprint.service.BlueprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BlueprintController {

    @Autowired
    private BlueprintService blueprintService;

   /* public BlueprintController(BlueprintService blueprintService){
        this.blueprintService = blueprintService;
    }*/

    public String create(){
        return blueprintService.create();
    }


}
