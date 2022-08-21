package com.angelamonsalvedev.disneyapirest.mapper;

import com.angelamonsalvedev.disneyapirest.dto.GeneroDTO;
import com.angelamonsalvedev.disneyapirest.entity.Genero;
import org.springframework.stereotype.Component;

@Component
public class GeneroToGeneroDTO implements IMapper<Genero, GeneroDTO>{
    @Override
    public GeneroDTO map(Genero in) {
        GeneroDTO generoDTO = new GeneroDTO();
        generoDTO.setImagen(in.getImagen());
        generoDTO.setNombre(in.getNombre());
        return generoDTO;
    }
}
