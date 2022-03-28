package com.cyrandote.blueprint.service;

import com.cyrandote.blueprint.api.v1.dto.DesignDTO;
import com.cyrandote.blueprint.api.v1.mapper.DesignMapper;
import com.cyrandote.blueprint.repository.DesignRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class TShirtDesignService implements DesignService{

    @Autowired
    private DesignRepository designRepository;

    @Autowired
    private DesignMapper designMapper;

    @Override
    public List<DesignDTO> getAllDesigns() {
        log.debug("Getting all designs..");
        List<DesignDTO> designs = new ArrayList<>();
        designRepository.findAll().forEach(design
                -> designs.add(designMapper.designToDesignDTO(design)));
        return designs;
    }

    @Override
    public DesignDTO getDesignByName(String name) {
        return designMapper.designToDesignDTO(designRepository.findByName(name));
    }
}
