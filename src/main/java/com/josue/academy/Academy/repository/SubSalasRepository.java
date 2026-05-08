package com.josue.academy.Academy.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josue.academy.Academy.models.entity.SubSalasEntity;


@Repository
public interface SubSalasRepository  extends JpaRepository<SubSalasEntity, Object>{
    
}
