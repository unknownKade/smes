package com.example.smes.masterdata;

import com.example.smes.global.common.SimpleDTO;
import com.example.smes.masterdata.service.MasterdataService;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Transactional
@SpringBootTest
public class MasterdataServiceTest {
    @Autowired
    MasterdataService masterdataService;

    @Test
    public void getByCategoryTest(){
        String category = "속성";
        List<SimpleDTO> result = masterdataService.getByCategory(category);

        Assertions.assertThat(result).isNotNull();
    }
}
