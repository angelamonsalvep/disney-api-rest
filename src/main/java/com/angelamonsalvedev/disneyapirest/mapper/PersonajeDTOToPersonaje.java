package com.angelamonsalvedev.disneyapirest.mapper;

import com.angelamonsalvedev.disneyapirest.dto.PersonajeDTO;
import com.angelamonsalvedev.disneyapirest.entity.Personaje;
import org.springframework.stereotype.Component;

@Component
public class PersonajeDTOToPersonaje implements IMapper<PersonajeDTO, Personaje>{

    @Override
    public Personaje map(PersonajeDTO in) {
        Personaje personaje = new Personaje();
        personaje.setImagen(in.getImagen());
        personaje.setNombre(in.getNombre());
        personaje.setEdad(in.getEdad());
        personaje.setPeso(in.getPeso());
        personaje.setHistoria(in.getHistoria());
        return personaje;
    }
}
