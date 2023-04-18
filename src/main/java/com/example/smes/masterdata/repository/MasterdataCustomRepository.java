package com.example.smes.masterdata.repository;


import com.example.smes.global.common.SimpleDTO;
import com.example.smes.masterdata.dto.MasterdataDTO;
import com.example.smes.masterdata.dto.MasterdataSearchCriteria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MasterdataCustomRepository {
    Page<MasterdataDTO> search(MasterdataSearchCriteria criteria, Pageable pageable);
    List<SimpleDTO> getByCategory(String id);
}
