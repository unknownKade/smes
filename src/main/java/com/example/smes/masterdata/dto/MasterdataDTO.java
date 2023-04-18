package com.example.smes.masterdata.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class MasterdataDTO {
    private String id;
    private String category;
    private String name;

    @QueryProjection
    public MasterdataDTO(String id, String category, String name) {
        this.id = id;
        this.category = category;
        this.name = name;
    }
}
