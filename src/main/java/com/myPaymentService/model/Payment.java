package com.myPaymentService.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Payment extends BaseClass {

    Long orderId;
    Long amount;
    Long UserId;
    PaymentStuatus paymentStuatus;
    String paymentUrl;
    String callbackUrl;
    PaymentGateway paymentGateway;
    private String paymentGatewayReferenceId;

}
