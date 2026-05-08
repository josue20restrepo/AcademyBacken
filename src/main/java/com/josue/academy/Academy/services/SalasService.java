package com.josue.academy.Academy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.josue.academy.Academy.models.dtos.SalasDTO;
import com.josue.academy.Academy.models.entity.SalasEntity;
import com.josue.academy.Academy.repository.SalasRepository;

@Service
public class SalasService {

    private final SalasRepository salaRepository;

    public SalasService(SalasRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    // Conversión de Entity a DTO
    private SalasDTO toDTO(SalasEntity entity) {
        SalasDTO dto = new SalasDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setDescripcion(entity.getDescripcion());
        dto.setActiva(entity.getActiva());
        dto.setCantidadUsuarios(entity.getCantidadUsuarios());
        return dto;
    }

    // Listar todas las salas como DTO
    public List<SalasDTO> listarSalasDTO() {
        return salaRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }
}