package com.angelamonsalvedev.disneyapirest.repository;

import com.angelamonsalvedev.disneyapirest.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
}
