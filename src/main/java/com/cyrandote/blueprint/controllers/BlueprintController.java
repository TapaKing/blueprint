package com.cyrandote.blueprint.controllers;

import com.cyrandote.blueprint.api.v1.dto.DesignDTO;
import com.cyrandote.blueprint.domain.Category;
import com.cyrandote.blueprint.domain.Design;
import com.cyrandote.blueprint.repository.CategoryRepository;
import com.cyrandote.blueprint.repository.TextRepository;
import com.cyrandote.blueprint.service.BlueprintService;
import com.cyrandote.blueprint.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
public class BlueprintController {

    @Autowired
    private BlueprintService blueprintService;

   @Autowired
   private DesignService designService;

    public String create(){
        return blueprintService.create();
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        List<DesignDTO> designs = designService.getAllDesigns();
        designs.stream().forEach(design -> printDesignDetails(design));
        return "index";
    }

    private void printDesignDetails(DesignDTO design){
        System.out.println("Design name: " + design.getName());
        System.out.println("Design description: " + design.getDescription());
        System.out.println("Design base color: " + design.getBaseColor());
        System.out.println("Design notes: " + design.getNotes());
    }
/*
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

       model.addAttribute("designs", designService.getDesigns());
        return "index";
    }*/

}
