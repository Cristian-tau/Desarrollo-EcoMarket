package com.ecomarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomarket.model.Paquete;

@Repository
public interface PaqueteRepository extends JpaRepository<Paquete, Integer> {
    
}

