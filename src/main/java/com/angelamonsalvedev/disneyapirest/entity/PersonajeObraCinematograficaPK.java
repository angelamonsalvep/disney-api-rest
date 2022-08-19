package com.angelamonsalvedev.disneyapirest.entity;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class PersonajeObraCinematograficaPK implements Serializable {

    @Column(name = "id_personaje")
    private Long idPersonaje;

    @Column(name = "id_obra")
    private  Long idObra;
}
