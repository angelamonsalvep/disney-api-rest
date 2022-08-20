package com.angelamonsalvedev.disneyapirest.dto;

import com.angelamonsalvedev.disneyapirest.entity.PersonajeObraCinematografica;
import lombok.Data;

import java.util.List;

@Data
public class PersonajeDTO {

    private String imagen;
    private String nombre;
    private Short edad;
    private float peso;
    private String historia;
}
