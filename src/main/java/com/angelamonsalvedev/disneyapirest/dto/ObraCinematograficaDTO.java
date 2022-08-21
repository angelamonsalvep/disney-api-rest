package com.angelamonsalvedev.disneyapirest.dto;

import com.angelamonsalvedev.disneyapirest.entity.Genero;
import com.angelamonsalvedev.disneyapirest.entity.PersonajeObraCinematografica;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ObraCinematograficaDTO {

    private String imagen;
    private String titulo;
    private LocalDateTime FechaDeCreacion;
    private Short calificacion;
    private Genero genero;
    private List<PersonajeObraCinematografica> Personajes;
}
