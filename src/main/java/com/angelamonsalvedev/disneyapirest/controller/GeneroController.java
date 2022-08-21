package com.angelamonsalvedev.disneyapirest.controller;

import com.angelamonsalvedev.disneyapirest.dto.GeneroDTO;
import com.angelamonsalvedev.disneyapirest.entity.Genero;
import com.angelamonsalvedev.disneyapirest.mapper.GeneroDTOToGenero;
import com.angelamonsalvedev.disneyapirest.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gender")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @PostMapping
    public ResponseEntity<Genero> crearGenero(@RequestBody GeneroDTO generoDTO){
        return new ResponseEntity<>(generoService.crearGenero(generoDTO), HttpStatus.CREATED);
    }
}
