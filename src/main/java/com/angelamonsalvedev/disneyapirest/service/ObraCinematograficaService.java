package com.angelamonsalvedev.disneyapirest.service;

import com.angelamonsalvedev.disneyapirest.dto.ObraCinematograficaDTO;

import java.util.List;

public interface ObraCinematograficaService {

    public ObraCinematograficaDTO crearObra(ObraCinematograficaDTO obraCinematograficaDTO);

    public List<ObraCinematograficaDTO> listarObrasCinematograficas();
}
