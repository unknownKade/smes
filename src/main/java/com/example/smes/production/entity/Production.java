package com.example.smes.production.entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Production{
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private LocalDateTime date;
    private String facility;
    private String worker;
    private String product;
    private String lot;
    private Float unit_qty;
    private Float perunit_qty;
}