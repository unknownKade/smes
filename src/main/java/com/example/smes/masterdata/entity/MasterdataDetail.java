package com.example.smes.masterdata.entity;

import jakarta.persistence.*;

@Entity
public class MasterdataDetail {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private String masterdata;
    private String name;
    private Integer seq;
    @Column(name="use_yn")
    private boolean isUsed;
}
