package com.example.smes.production.entity;

import jakarta.persistence.*;

@Entity
public class ProductionDetail {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private String production;
    private Integer seq;
    private String product;
    private Float qty;
    private String unit;

}
