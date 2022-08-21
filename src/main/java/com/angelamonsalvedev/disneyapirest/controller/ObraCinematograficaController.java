package com.angelamonsalvedev.disneyapirest.controller;

import com.angelamonsalvedev.disneyapirest.dto.ObraCinematograficaDTO;
import com.angelamonsalvedev.disneyapirest.service.ObraCinematograficaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class ObraCinematograficaController {

    @Autowired
    private ObraCinematograficaService obraCinematograficaService;

    @PostMapping
    public ResponseEntity<ObraCinematograficaDTO> crearObraCinematografica(@RequestBody ObraCinematograficaDTO obraCinematograficaDTO){
        return new ResponseEntity<>(obraCinematograficaService.crearObra(obraCinematograficaDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ObraCinematograficaDTO>> listarObrasCinematograficas(){
        return new ResponseEntity<>(obraCinematograficaService.listarObrasCinematograficas(), HttpStatus.OK);
    }
}
