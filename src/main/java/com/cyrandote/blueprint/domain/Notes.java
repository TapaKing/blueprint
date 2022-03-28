package com.cyrandote.blueprint.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
//@EqualsAndHashCode(exclude = {"design"})
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne //Owned by Design entity, hence no cascade
    private Design design;

    @Lob
    private String notes;
}
