package com.josue.academy.Academy.models.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalasDTO {
    
    private Long id;
    private String nombre;
    private String descripcion;
    private Boolean activa = true;
    private Integer cantidadUsuarios = 0;
}
