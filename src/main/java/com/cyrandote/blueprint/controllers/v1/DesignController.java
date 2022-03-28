package com.cyrandote.blueprint.controllers.v1;

import com.cyrandote.blueprint.api.v1.dto.DesignDTO;
import com.cyrandote.blueprint.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(DesignController.BASE_URL)
public class DesignController {

    public static final String BASE_URL = "/api/v1/designs";

    @Autowired
    private DesignService designService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DesignDTO> getAllDesigns(){
        return designService.getAllDesigns();
    }
}
