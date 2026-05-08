package com.josue.academy.Academy.models.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "mensajes")
public class MensajeEntity  extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(nullable = false, length = 500)
    private String contenido;

    @Column(nullable = false)
    private LocalDateTime fechaEnvio;

    // Relación con Usuario (quién envió el mensaje)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    // Relación con Sala (opcional: si el mensaje pertenece a una sala principal)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sala_id")
    private SalasEntity sala;

    // Relación con SubSala (opcional: si el mensaje pertenece a una sub-sala)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_sala_id")
    private SubSalasEntity subSala;

 
}
