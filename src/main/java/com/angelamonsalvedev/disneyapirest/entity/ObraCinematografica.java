package com.angelamonsalvedev.disneyapirest.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "obras_cinematograficas")
public class ObraCinematografica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_obra")
    private Long id;

    @Column(name = "imagen_obra")
    private String imagen;

    @Column(name = "titulo_obra")
    private String titulo;

    @Column(name = "fecha_creacion_obra")
    private LocalDateTime FechaDeCreacion;

    @Column(name = "calificacion_obra")
    private Short calificacion;

    @OneToMany(mappedBy = "personaje")
    private List<PersonajeObraCinematografica> Personajes;

    @ManyToOne
    @JoinColumn(name = "id_genero", insertable = false, updatable = false)
    private Genero genero;
}
