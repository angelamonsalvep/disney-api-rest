package com.angelamonsalvedev.disneyapirest.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_genero")
    private Long id;

    @Column(name = "nombre_genero")
    private String nombre;

    @Column(name = "imagen_genero")
    private String imagen;

    @OneToMany(mappedBy = "genero")
    private List<ObraCinematografica> obrasCinematograficas;

}
