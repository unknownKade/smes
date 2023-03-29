package com.example.smes.product.entity;

import jakarta.persistence.*;

@Entity
public class ProductDetail{
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private String product;
    private String detail;
    private String value;
}