package com.josue.academy.Academy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.josue.academy.Academy.models.dtos.UsuarioDTO;
import com.josue.academy.Academy.models.entity.Usuario;
import com.josue.academy.Academy.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;


    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
      
    }

    private UsuarioDTO toDTO(Usuario entity) {
    UsuarioDTO dto = new UsuarioDTO();
    dto.setId(entity.getId());
    dto.setNombre(entity.getNombre());
    dto.setUsername(entity.getUsername());
    return dto;
    }

         public List<UsuarioDTO> listarUsuariosDTO() {
        return usuarioRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }
    
    
    
}
