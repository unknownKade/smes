package com.example.smes.masterdata.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MasterDataRepositoryTest {

    @Autowired
    MasterDataRepository masterDataRepository;
    @Test
    public void testJpaRepository(){
        masterDataRepository.getMasterDataById("asdf");
    }



}
