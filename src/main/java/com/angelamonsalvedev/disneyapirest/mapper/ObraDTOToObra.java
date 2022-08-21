package com.angelamonsalvedev.disneyapirest.mapper;

import com.angelamonsalvedev.disneyapirest.dto.ObraCinematograficaDTO;
import com.angelamonsalvedev.disneyapirest.entity.ObraCinematografica;
import org.springframework.stereotype.Component;

@Component
public class ObraDTOToObra implements IMapper<ObraCinematograficaDTO, ObraCinematografica> {

    @Override
    public ObraCinematografica map(ObraCinematograficaDTO in) {
        ObraCinematografica obraCinematografica = new ObraCinematografica();
        obraCinematografica.setCalificacion(in.getCalificacion());
        obraCinematografica.setGenero(in.getGenero());
        obraCinematografica.setFechaDeCreacion(in.getFechaDeCreacion());
        obraCinematografica.setImagen(in.getImagen());
        obraCinematografica.setPersonajes(in.getPersonajes());
        obraCinematografica.setTitulo(in.getTitulo());
        return obraCinematografica;
    }
}
