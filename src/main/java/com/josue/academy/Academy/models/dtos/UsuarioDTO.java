package com.josue.academy.Academy.models.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {
    
    private Long id;
    private String nombre;
    private String email;
    private String username;
    private Boolean activo = true;

}
