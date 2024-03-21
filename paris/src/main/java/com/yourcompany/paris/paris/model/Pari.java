package com.yourcompany.paris.paris.model;
import javax.persistence.*;

@Entity
public class Pari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPari;

    // Constructeur par défaut
    public Pari() {
    }

    // Getters et setters
    public Long getIdPari() {
        return idPari;
    }

    public void setIdPari(Long idPari) {
        this.idPari = idPari;
    }
}

