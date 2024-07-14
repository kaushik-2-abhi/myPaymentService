package com.myPaymentService.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
