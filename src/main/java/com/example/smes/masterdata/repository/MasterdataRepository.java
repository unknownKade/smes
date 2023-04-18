package com.example.smes.masterdata.repository;

import com.example.smes.masterdata.entity.Masterdata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterdataRepository extends JpaRepository<Masterdata, String>, MasterdataCustomRepository {
}
