package com.cyrandote.blueprint.service;

import com.cyrandote.blueprint.api.v1.dto.DesignDTO;
import com.cyrandote.blueprint.api.v1.mapper.DesignMapper;
import com.cyrandote.blueprint.domain.BaseColor;
import com.cyrandote.blueprint.domain.Design;
import com.cyrandote.blueprint.domain.InkConsumption;
import com.cyrandote.blueprint.repository.DesignRepository;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class DesignServiceTest {

    public static final String PUN_DESIGN = "Pun design";

    @InjectMocks
    DesignService cut = new TShirtDesignService();

    @Mock
    DesignRepository designRepository;

    @Mock
    DesignMapper designMapper = DesignMapper.INSTANCE;

    @BeforeEach
    public void setUp() throws Exception{
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getAllDesigns(){
        //Given
        List<Design> designList = new ArrayList<>();
        designList.add(createDesign());
        Mockito.when(designRepository.findAll()).thenReturn(designList);

        //When
        List<DesignDTO> designDTOS = cut.getAllDesigns();

        //Then
        Assertions.assertEquals(1, designDTOS.size());
    }

    private Design createDesign(){
        Design design = new Design();
        design.setName(PUN_DESIGN);
        design.setDescription(PUN_DESIGN);
        design.setBaseColor(BaseColor.WHITE);
        design.setInkConsumption(InkConsumption.LOW);
        return design;
    }

}
