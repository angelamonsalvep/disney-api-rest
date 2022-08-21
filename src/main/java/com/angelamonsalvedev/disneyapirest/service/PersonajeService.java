package com.angelamonsalvedev.disneyapirest.service;

import com.angelamonsalvedev.disneyapirest.dto.PersonajeDTO;
import com.angelamonsalvedev.disneyapirest.entity.Personaje;

import java.util.List;

public interface PersonajeService {

    public Personaje crearPersonaje(PersonajeDTO personajeDTO);

    public List<PersonajeDTO> listarPersonajes();

    public PersonajeDTO obtenerPersonajePorId(Long id);

    public PersonajeDTO actualizarPersonaje(PersonajeDTO personajeDTO, Long id);

    public void eliminarPersonaje(Long id);

    public List<PersonajeDTO> obtenerPersonajePorNombre(String nombre);

    public List<PersonajeDTO> obtenerPersonajePorEdad(Short edad);
}
