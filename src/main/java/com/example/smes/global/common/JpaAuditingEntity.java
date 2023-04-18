package com.example.smes.global.common;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
public class JpaAuditingEntity {
        @CreatedDate
        @Column(name = "create_date", updatable = false)
        private LocalDateTime createdDate;

        @LastModifiedDate
        @Column(name = "modified_by")
        private LocalDateTime updatedDate;

        @CreatedBy
        @Column(name = "created_by", updatable = false)
        private String createdId;

        @LastModifiedBy
        @Column(name = "modified_date")
        private String updatedId;

        @Column(name = "team")
        private String team;
}
