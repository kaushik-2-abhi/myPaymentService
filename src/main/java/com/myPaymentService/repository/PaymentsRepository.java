package com.myPaymentService.repository;


import com.myPaymentService.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepository extends JpaRepository<Payment,Long> {

    public Payment findByOrderId(Long id);



}
