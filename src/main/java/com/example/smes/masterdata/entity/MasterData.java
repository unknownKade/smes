package com.example.smes.masterdata.entity;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
@Table(name= "masterdata")
public class MasterData {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private String category;
    private String name;
    private String type;
}
