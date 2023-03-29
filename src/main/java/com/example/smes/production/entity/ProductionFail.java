package com.example.smes.production.entity;

import jakarta.persistence.*;

@Entity
public class ProductionFail {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private String production;
    private Integer seq;
    private String faulty;
    private Float qty;
    private String unit;
}
