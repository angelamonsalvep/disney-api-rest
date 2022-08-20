package com.angelamonsalvedev.disneyapirest.service;

import com.angelamonsalvedev.disneyapirest.dto.PersonajeDTO;
import com.angelamonsalvedev.disneyapirest.entity.Personaje;

import java.util.List;

public interface PersonajeService {

    public Personaje crearPersonaje(PersonajeDTO personajeDTO);

    public List<PersonajeDTO> listarPersonajes();
}
