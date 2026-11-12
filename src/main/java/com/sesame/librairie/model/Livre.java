package com.sesame.librairie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livre {

    private Long id;
    private String titre;
    private String auteur;
    private int annee;
}
