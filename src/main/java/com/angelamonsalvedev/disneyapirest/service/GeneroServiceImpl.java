package com.angelamonsalvedev.disneyapirest.service;

import com.angelamonsalvedev.disneyapirest.dto.GeneroDTO;
import com.angelamonsalvedev.disneyapirest.entity.Genero;
import com.angelamonsalvedev.disneyapirest.mapper.GeneroDTOToGenero;
import com.angelamonsalvedev.disneyapirest.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroServiceImpl implements GeneroService{

    @Autowired
    private GeneroRepository generoRepository;
    @Autowired
    private GeneroDTOToGenero generoDTOToGenero;

    @Override
    public Genero crearGenero(GeneroDTO generoDTO) {
        Genero genero = generoDTOToGenero.map(generoDTO);
        return generoRepository.save(genero);
    }
}
