package com.example.smes.masterdata.dto;


import lombok.Data;

import java.util.List;

@Data
public class MasterdataSearchCriteria {
    private List<String> category;
    private String keyword;
}