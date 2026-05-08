package com.josue.academy.Academy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.josue.academy.Academy.models.dtos.MensajesDTO;
import com.josue.academy.Academy.models.entity.MensajeEntity;
import com.josue.academy.Academy.repository.MensajeRepository;

@Service
public class MensajesService {

    private final MensajeRepository mensajeRepository;

    public MensajesService(MensajeRepository mensajeRepository) {
        this.mensajeRepository = mensajeRepository;
    }

    // Conversión de Entity a DTO
    private MensajesDTO  toDTO(MensajeEntity entity) {
        MensajesDTO dto = new MensajesDTO();
        dto.setId(entity.getId());
        dto.setContenido(entity.getContenido());
      // ejemplo: solo id del usuario
        return dto;
    }

    // Listar todos los mensajes como DTO
    public List<MensajesDTO> listarMensajesDTO() {
        return mensajeRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }
}