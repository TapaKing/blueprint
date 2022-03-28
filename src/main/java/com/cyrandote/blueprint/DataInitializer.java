package com.cyrandote.blueprint;

import com.cyrandote.blueprint.domain.*;
import com.cyrandote.blueprint.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner{
        //implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private DesignRepository designRepository;

    @Override
    public void run(String... args) throws Exception {
        designRepository.saveAll(createDesigns());
    }

    /*@Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        designRepository.saveAll(createDesigns());
    }*/

    private List<Design> createDesigns(){
        List<Design> designs = new ArrayList<>();
        Design design = new Design();
        design.setName("Humorous 10");
        design.setDescription("Humorous 10");
        design.setBaseColor(BaseColor.WHITE);
        design.setCategories(createCategories());
        design.setInkConsumption(InkConsumption.LOW);
        design.setRating(5);
        design.setNotes(createNotes());
        design.addText(createText());

        designs.add(design);
        return designs;
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
