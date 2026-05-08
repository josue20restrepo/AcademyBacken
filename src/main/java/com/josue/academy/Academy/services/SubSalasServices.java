package com.josue.academy.Academy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.josue.academy.Academy.models.dtos.SubSalasDTO;
import com.josue.academy.Academy.models.entity.SubSalasEntity;
import com.josue.academy.Academy.repository.SubSalasRepository;

@Service
public class SubSalasServices {

    private final SubSalasRepository subSalaRepository;

    // Constructor con inyección de dependencias
    public SubSalasServices(SubSalasRepository subSalaRepository) {
        this.subSalaRepository = subSalaRepository;
    }

    // Conversión de Entity a DTO
    private SubSalasDTO toDTO(SubSalasEntity entity) {
        SubSalasDTO dto = new SubSalasDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setDescripcion(entity.getDescripcion());

        return dto;
    }

    // Listar todas las SubSalas como DTO
    public List<SubSalasDTO> listarSubSalasDTO() {
        return subSalaRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }
}
