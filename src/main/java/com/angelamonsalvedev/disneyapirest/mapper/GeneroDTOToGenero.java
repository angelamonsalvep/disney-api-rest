package com.angelamonsalvedev.disneyapirest.mapper;

import com.angelamonsalvedev.disneyapirest.dto.GeneroDTO;
import com.angelamonsalvedev.disneyapirest.entity.Genero;
import org.springframework.stereotype.Component;

@Component
public class GeneroDTOToGenero implements IMapper<GeneroDTO, Genero>{
    @Override
    public Genero map(GeneroDTO in) {
        Genero genero = new Genero();
        genero.setNombre(in.getNombre());
        genero.setImagen(in.getImagen());
        genero.setObrasCinematograficas(null);
        return genero;
    }
}
