package com.cyrandote.blueprint.api.v1.mapper;


import com.cyrandote.blueprint.api.v1.dto.DesignDTO;
import com.cyrandote.blueprint.domain.*;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;


import java.util.ArrayList;
import java.util.List;

public class DesignMapperTest {

    private DesignMapper cut = DesignMapper.INSTANCE;
    private static final String NAME = "Humorous 10";
    private static final String DESCRIPTION = "Humorous 10";

    @Test
    public void designToDesignDTOMapper(){
        //Given
        Design design = createDesign();

        //When
        DesignDTO designDTO = cut.designToDesignDTO(design);

        //Then
        Assert.isTrue(NAME == designDTO.getName(), "Mapping is incorrect!");
    }

    private Design createDesign(){
        Design design = new Design();
        design.setName(NAME);
        design.setDescription(DESCRIPTION);
        design.setBaseColor(BaseColor.WHITE);
        design.setCategories(createCategories());
        design.setInkConsumption(InkConsumption.LOW);
        design.setRating(5);
        design.setNotes(createNotes());
        design.addText(createText());

        return design;
    }

    private List<Category> createCategories(){
        List<Category>categories = new ArrayList<>();
        Category category = new Category();
        category.setCategory("Pun");
        categories.add(category);
        return categories;
    }

    private Notes createNotes(){
        Notes notes = new Notes();
        notes.setNotes("Humorous unisex T-Shirt");
        return notes;
    }

    private Text createText(){
        Text text = new Text();
        text.setText("When life gives you melons, you are dyslexic.");
        return text;
    }

}
