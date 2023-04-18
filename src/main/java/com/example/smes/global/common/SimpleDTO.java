package com.example.smes.global.common;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class SimpleDTO {
    private String id;
    private String name;

    @QueryProjection
    public SimpleDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
