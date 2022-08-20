package com.angelamonsalvedev.disneyapirest.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private String nombreDelRecurso;
    private String nombreDelCampo;
    private Long valorDelCampo;

    public ResourceNotFoundException(String nombreDelRecurso, String nombreDelCampo, Long valorDelCampo) {
        super(String.format("%s no encontrado con: %s : '%s' ", nombreDelRecurso, nombreDelCampo, valorDelCampo));
        this.nombreDelRecurso = nombreDelRecurso;
        this.nombreDelCampo = nombreDelCampo;
        this.valorDelCampo = valorDelCampo;
    }
}
