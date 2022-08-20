package com.angelamonsalvedev.disneyapirest.mapper;

import com.angelamonsalvedev.disneyapirest.dto.PersonajeDTO;
import com.angelamonsalvedev.disneyapirest.entity.Personaje;
import org.springframework.stereotype.Component;

@Component
public class PersonajeToPersonajeDTO implements IMapper<Personaje, PersonajeDTO>{
    @Override
    public PersonajeDTO map(Personaje in) {
        PersonajeDTO personajeDTO = new PersonajeDTO();
        personajeDTO.setEdad(in.getEdad());
        personajeDTO.setHistoria(in.getHistoria());
        personajeDTO.setImagen(in.getImagen());
        personajeDTO.setNombre(in.getNombre());
        personajeDTO.setPeso(in.getPeso());
        return personajeDTO;
    }
}
