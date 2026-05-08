package com.josue.academy.Academy.models.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MensajesDTO {

    private Long id;
    private String contenido;
    private Long idSala;
    private Long idUsuario;
    
}
