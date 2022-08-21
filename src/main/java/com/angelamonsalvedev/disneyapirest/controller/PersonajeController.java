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
    public ResponseEntity<List<PersonajeDTO>> listarPersonajes(@RequestParam(name = "name", required = false) String nombrePersonaje){
        if(nombrePersonaje!=null){
            return new ResponseEntity<>(personajeService.obtenerPersonajePorNombre(nombrePersonaje), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(personajeService.listarPersonajes(), HttpStatus.OK);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonajeDTO> obtenerPersonajePorId(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(personajeService.obtenerPersonajePorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonajeDTO> actualizarPersonaje(@RequestBody PersonajeDTO personajeDTO, @PathVariable(name = "id") Long id){
        return new ResponseEntity(personajeService.actualizarPersonaje(personajeDTO, id), HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPersonaje(@PathVariable(name = "id") Long id){
        personajeService.eliminarPersonaje(id);
        return new ResponseEntity<>("Personaje eliminado", HttpStatus.OK);
    }
}
