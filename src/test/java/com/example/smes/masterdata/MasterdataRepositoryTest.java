package com.example.smes.masterdata;

import com.example.smes.global.common.SimpleDTO;
import com.example.smes.masterdata.dto.MasterdataDTO;
import com.example.smes.masterdata.dto.MasterdataSearchCriteria;
import com.example.smes.masterdata.repository.MasterdataRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MasterdataRepositoryTest {

    @Autowired
    MasterdataRepository masterDataRepository;
    @Test
    public void searchTest(){
        //given
        List<String> category = new ArrayList<>();
        category.add("PROPS");
        String sortBy = "name";

        MasterdataSearchCriteria criteria =  new MasterdataSearchCriteria();
        criteria.setCategory(category);
        Sort sort = Sort.by(Sort.Direction.ASC,sortBy);

        //when
        Pageable pageable = PageRequest.of(0,5, sort);
        Page<MasterdataDTO> result = masterDataRepository.search(criteria, pageable);

        //then
        Assertions.assertThat(result).isNotNull();
    }


    @Test
    public void getByCategoryTest(){
        //given
        String category = "PROPS";
        //when
        List<SimpleDTO> result = masterDataRepository.getByCategory(category);
        //then
        Assertions.assertThat(result).isNotNull();
    }

}
