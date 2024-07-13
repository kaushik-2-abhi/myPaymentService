package com.myPaymentService.model;

import jakarta.persistence.*;


@MappedSuperclass
public class BaseClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
}
