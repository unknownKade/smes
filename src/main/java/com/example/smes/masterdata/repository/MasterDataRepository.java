package com.example.smes.masterdata.repository;

import com.example.smes.masterdata.entity.MasterData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterDataRepository extends JpaRepository<MasterData, String> {
    public MasterData getMasterDataById(String id);
}
