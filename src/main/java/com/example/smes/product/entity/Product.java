package com.example.smes.product.entity;
import jakarta.persistence.*;

@Entity
public class Product{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String category;
    private String lot;
    private String unit;
    private String perunit ;
    private Float peramount;
    private Float inventory;
}
