package com.cyrandote.blueprint.api.v1.dto;

import com.cyrandote.blueprint.domain.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DesignDTO {

    private String name;
    private String description;
    private BaseColor baseColor;
    private List<Category> categories = new ArrayList<>();
    private InkConsumption inkConsumption;
    private Integer rating;
    private Notes notes;
    private List<Text> texts = new ArrayList<>();

}
