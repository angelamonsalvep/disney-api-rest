package com.angelamonsalvedev.disneyapirest.service;

import com.angelamonsalvedev.disneyapirest.dto.PersonajeDTO;
import com.angelamonsalvedev.disneyapirest.entity.Personaje;
import com.angelamonsalvedev.disneyapirest.mapper.PersonajeDTOToPersonaje;
import com.angelamonsalvedev.disneyapirest.mapper.PersonajeToPersonajeDTO;
import com.angelamonsalvedev.disneyapirest.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonajeServiceImpl implements PersonajeService{

    @Autowired
    private PersonajeRepository personajeRepository;
    @Autowired
    private PersonajeDTOToPersonaje personajeDTOToPersonaje;
    @Autowired
    private PersonajeToPersonajeDTO personajeToPersonajeDTO;


    @Override
    public Personaje crearPersonaje(PersonajeDTO personajeDTO) {
        Personaje personaje = personajeDTOToPersonaje.map(personajeDTO);
        return personajeRepository.save(personaje);
    }

    @Override
    public List<PersonajeDTO> listarPersonajes() {
        List<Personaje> personajes = personajeRepository.findAll();
        return personajes.stream().map(personaje -> personajeToPersonajeDTO.map(personaje)).collect(Collectors.toList());

    }
}
