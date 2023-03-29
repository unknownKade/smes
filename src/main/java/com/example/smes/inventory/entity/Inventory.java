package com.example.smes.inventory.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class Inventory {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private LocalDateTime date;
    private String lot;
    private String client;
    private String type;
    private String memo;
}
