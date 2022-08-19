package com.angelamonsalvedev.disneyapirest.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnTransformer;

import javax.persistence.*;

@Data
@Entity
@Table(name = "personajes_obras")
public class PersonajeObraCinematografica {

    @EmbeddedId
    private PersonajeObraCinematograficaPK id;

    @Column(name = "rol_personaje_obra")
    private String rol;

    @ManyToOne
    @JoinColumn(name = "id_personaje", insertable = false, updatable = false)
    private Personaje personaje;

    @ManyToOne
    @JoinColumn(name = "id_obra", insertable = false, updatable = false)
    private ObraCinematografica obraCinematografica;
}
