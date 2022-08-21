package com.angelamonsalvedev.disneyapirest.mapper;

import com.angelamonsalvedev.disneyapirest.dto.ObraCinematograficaDTO;
import com.angelamonsalvedev.disneyapirest.entity.ObraCinematografica;
import org.springframework.stereotype.Component;

@Component
public class ObraToObraDTO implements IMapper<ObraCinematografica, ObraCinematograficaDTO>{
    @Override
    public ObraCinematograficaDTO map(ObraCinematografica in) {
        ObraCinematograficaDTO obraCinematograficaDTO = new ObraCinematograficaDTO();
        obraCinematograficaDTO.setCalificacion(in.getCalificacion());
        obraCinematograficaDTO.setGenero(in.getGenero());
        obraCinematograficaDTO.setImagen(in.getImagen());
        obraCinematograficaDTO.setPersonajes(in.getPersonajes());
        obraCinematograficaDTO.setTitulo(in.getTitulo());
        obraCinematograficaDTO.setFechaDeCreacion(in.getFechaDeCreacion());
        return obraCinematograficaDTO;
    }
}
