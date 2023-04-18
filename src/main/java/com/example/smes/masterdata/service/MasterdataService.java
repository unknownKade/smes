package com.example.smes.masterdata.service;

import com.example.smes.global.common.CategoryEnum;
import com.example.smes.global.common.SimpleDTO;
import com.example.smes.masterdata.dto.MasterdataDTO;
import com.example.smes.masterdata.dto.MasterdataSearchCriteria;
import com.example.smes.masterdata.repository.MasterdataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MasterdataService {

    private final MasterdataRepository masterdataRepository;

    //1.2.1 기준정보 리스트
    public Page<MasterdataDTO> search(MasterdataSearchCriteria criteria, Pageable pageable){
        return masterdataRepository.search(criteria, pageable);
    }

    public List<SimpleDTO> getByCategory(String category){
        String str = CategoryEnum.codeOf(category);
        return masterdataRepository.getByCategory(str);
    }
}
