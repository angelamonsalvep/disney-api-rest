package com.angelamonsalvedev.disneyapirest.service;

import com.angelamonsalvedev.disneyapirest.dto.PersonajeDTO;
import com.angelamonsalvedev.disneyapirest.entity.Personaje;
import com.angelamonsalvedev.disneyapirest.exception.ResourceNotFoundException;
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

    @Override
    public PersonajeDTO obtenerPersonajePorId(Long id) {
        Personaje personaje = personajeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Personaje", "id", id ));
        return personajeToPersonajeDTO.map(personaje);
    }

    @Override
    public PersonajeDTO actualizarPersonaje(PersonajeDTO personajeDTO, Long id) {
        Personaje personaje = personajeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Personaje", "id", id ));
        personaje.setNombre(personajeDTO.getNombre());
        personaje.setImagen(personajeDTO.getImagen());
        personaje.setEdad(personajeDTO.getEdad());
        personaje.setPeso(personajeDTO.getPeso());
        personaje.setHistoria(personajeDTO.getHistoria());
        Personaje personajeActualizado = personajeRepository.save(personaje);
        return personajeToPersonajeDTO.map(personajeActualizado);
    }

    @Override
    public void eliminarPersonaje(Long id) {
        Personaje personaje = personajeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Personaje", "id", id ));
        personajeRepository.delete(personaje);
    }

    @Override
    public List<PersonajeDTO> obtenerPersonajePorNombre(String nombre) {
        List<Personaje> personajes = personajeRepository.findAllByNombre(nombre);
        return personajes.stream().map(personaje -> personajeToPersonajeDTO.map(personaje)).collect(Collectors.toList());

    }
}
