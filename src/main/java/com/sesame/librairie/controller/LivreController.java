package com.sesame.librairie.controller;
import com.sesame.librairie.model.Livre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
//Commentaire ajouté pour faire un autre commit, puisque le commit précédent disait que c'est TP1 mais c'est plutot TP2
@RestController
@RequestMapping("/api/livres")
public class LivreController {
    // Les livres sont gardés en mémoire (pas encore de base de données)
    private final List<Livre> livres = new ArrayList<>();
    @GetMapping("/bonjour")
    public String bonjour() {
        return "Bonjour depuis la bibliothèque";
    }
    public LivreController() {
        livres.add(new Livre(1L, "Les Misérables", "Victor Hugo", 1862));
        livres.add(new Livre(2L, "Notre-Dame de Paris", "Victor Hugo", 1831));
        livres.add(new Livre(3L, "L'Étranger", "Albert Camus", 1942));
        livres.add(new Livre(4L, "La Peste", "Albert Camus", 1947));
        livres.add(new Livre(5L, "Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
    }
    @GetMapping("/listes")
    public List<Livre> lister() {
        return livres;
    }

}
