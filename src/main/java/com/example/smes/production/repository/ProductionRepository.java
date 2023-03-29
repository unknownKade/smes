package com.example.smes.production.repository;

import com.example.smes.production.entity.Production;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionRepository extends JpaRepository<Production, String> {
}
