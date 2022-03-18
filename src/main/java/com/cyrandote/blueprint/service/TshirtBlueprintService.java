package com.cyrandote.blueprint.service;

import org.springframework.stereotype.Service;

@Service
public class TshirtBlueprintService implements BlueprintService{

    @Override
    public String create() {
        return "Tshirt blueprint created!";
    }
}
