package com.angelamonsalvedev.disneyapirest.service;

import com.angelamonsalvedev.disneyapirest.dto.ObraCinematograficaDTO;
import com.angelamonsalvedev.disneyapirest.entity.ObraCinematografica;
import com.angelamonsalvedev.disneyapirest.mapper.ObraDTOToObra;
import com.angelamonsalvedev.disneyapirest.mapper.ObraToObraDTO;
import com.angelamonsalvedev.disneyapirest.repository.ObraCinematograficaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ObraCinematograficaServiceImpl implements ObraCinematograficaService{

    @Autowired
    private ObraCinematograficaRepository obraCinematograficaRepository;

    @Autowired
    private ObraDTOToObra obraDTOToObra;

    @Autowired
    private ObraToObraDTO obraToObraDTO;

    @Override
    public ObraCinematograficaDTO crearObra(ObraCinematograficaDTO obraCinematograficaDTO) {
        ObraCinematografica obraCinematografica = obraDTOToObra.map(obraCinematograficaDTO);
        return obraToObraDTO.map(obraCinematograficaRepository.save(obraCinematografica));
    }

    @Override
    public List<ObraCinematograficaDTO> listarObrasCinematograficas() {
        List<ObraCinematografica> obrasCinematograficas = obraCinematograficaRepository.findAll();
        return obrasCinematograficas.stream().map(obraCinematografica -> obraToObraDTO.map(obraCinematografica)).collect(Collectors.toList());
    }
}
