package com.example.smes.product.entity;
import jakarta.persistence.*;

@Entity
public class ProductBom{
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private String tree;
    private String product;
    private Integer level;
    private Integer seq;
    private Float qty;
}
