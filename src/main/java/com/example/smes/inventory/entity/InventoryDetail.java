package com.example.smes.inventory.entity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class InventoryDetail {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private String lot;
    private Integer seq;
    private String product;
    private String production;
    private Float price;
    private String unit;
    private Float qty;
}
