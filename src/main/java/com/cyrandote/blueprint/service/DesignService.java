package com.cyrandote.blueprint.service;

import com.cyrandote.blueprint.api.v1.dto.DesignDTO;

import java.util.List;

public interface DesignService {

    List<DesignDTO> getAllDesigns();

    DesignDTO getDesignByName(String name);
}
