package com.angelamonsalvedev.disneyapirest.controller;

import com.angelamonsalvedev.disneyapirest.dto.PersonajeDTO;
import com.angelamonsalvedev.disneyapirest.entity.Personaje;
import com.angelamonsalvedev.disneyapirest.service.PersonajeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class PersonajeController {

    private final PersonajeService personajeService;

    public PersonajeController(PersonajeService personajeService) {
        this.personajeService = personajeService;
    }

    @PostMapping
    public ResponseEntity<Personaje>  crearPersonaje(@RequestBody PersonajeDTO personajeDTO){
        return new ResponseEntity<>(personajeService.crearPersonaje(personajeDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PersonajeDTO>> listarPersonajes(){
        return new ResponseEntity<>(personajeService.listarPersonajes(), HttpStatus.OK);
    }
}
