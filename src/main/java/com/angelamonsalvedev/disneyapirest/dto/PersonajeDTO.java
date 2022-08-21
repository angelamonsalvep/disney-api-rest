package com.angelamonsalvedev.disneyapirest.dto;

import lombok.Data;

@Data
public class PersonajeDTO {

    private String imagen;
    private String nombre;
    private Short edad;
    private float peso;
    private String historia;
}
