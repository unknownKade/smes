package com.example.smes.masterdata.entity;

import jakarta.persistence.*;

@Entity
public class MasterDataDetail {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private String masterdata;
    private String name;
    private Integer seq;
    private String value;
}
