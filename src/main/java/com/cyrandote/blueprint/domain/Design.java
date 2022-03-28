package com.cyrandote.blueprint.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Design {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Should be supported by MySQL
    private Long id;
    private String name;
    private String description;

    @Lob //to be converted to Blob data in the DB (binary large object)
    private Byte[] image;

    @Enumerated(value = EnumType.STRING) //para mapreserve value pag nagdagdag ng enum (don't want ordinal value)
    private BaseColor baseColor;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="DESIGN_CATEGORY",
            joinColumns = @JoinColumn(name = "DESIGN_ID"),
            inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID"))
    private List<Category> categories = new ArrayList<>();

    @Enumerated(value = EnumType.STRING)
    private InkConsumption inkConsumption;
    private Integer rating;

    @OneToOne(cascade = CascadeType.ALL) //to delete notes when this Design is deleted
    private Notes notes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "design")
    private List<Text> texts = new ArrayList<>();

    public void setNotes(Notes notes){
        this.notes = notes;
        notes.setDesign(this);
    }

    public Design addText(Text text){
        text.setDesign(this);
        this.texts.add(text);
        return this;
    }
}
