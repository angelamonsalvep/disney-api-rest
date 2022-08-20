package com.angelamonsalvedev.disneyapirest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "personajes")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personaje")
    private Long id;

    @Column(name = "imagen_personaje")
    private String imagen;

    @Column(name = "nombre_personaje")
    private String nombre;

    @Column(name = "edad_personaje")
    private Short edad;

    @Column(name = "peso_personaje")
    private float peso;

    @Column(name = "historia_personaje")
    private String historia;

    @OneToMany(mappedBy = "obraCinematografica")
    private List<PersonajeObraCinematografica> obrasCinematograficas;

}
