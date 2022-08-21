package com.angelamonsalvedev.disneyapirest.repository;

import com.angelamonsalvedev.disneyapirest.dto.PersonajeDTO;
import com.angelamonsalvedev.disneyapirest.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

    public List<Personaje> findAllByNombre(String nombre);
}
