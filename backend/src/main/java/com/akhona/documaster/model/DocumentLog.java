package com.akhona.documaster.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class DocumentLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private String operation;
    private String status;
    private LocalDateTime createdAt;
}
