package com.josue.academy.Academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josue.academy.Academy.models.entity.MensajeEntity;


@Repository
public interface MensajeRepository extends JpaRepository <MensajeEntity, Long> {
    
}
