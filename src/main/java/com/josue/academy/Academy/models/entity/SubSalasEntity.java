package com.josue.academy.Academy.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "subsalas")
public class SubSalasEntity  extends BaseEntity {


    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false)
    private Integer capacidad;

    @Column(length = 255)
    private String descripcion;

    @Column(nullable = false)
    private Boolean activa = true;

    @Column(nullable = false)
    private Integer cantidadUsuarios = 0;

    // Relación con Sala principal
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sala_id", nullable = false)
    private SalasEntity sala;


}