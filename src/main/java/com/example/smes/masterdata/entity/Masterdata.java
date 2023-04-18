package com.example.smes.masterdata.entity;

import com.example.smes.global.common.JpaAuditingEntity;
import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name= "masterdata")
@EntityListeners(AuditingEntityListener.class)
public class Masterdata extends JpaAuditingEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private String category;
    private String name;
}
