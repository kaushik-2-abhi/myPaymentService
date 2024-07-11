package com.myPaymentService.model;

import jakarta.persistence.*;

@Entity
@MappedSuperclass
public class BaseClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
}
