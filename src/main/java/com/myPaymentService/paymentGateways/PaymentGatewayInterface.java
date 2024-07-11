package com.myPaymentService.paymentGateways;

import com.myPaymentService.model.PaymentStuatus;

public interface PaymentGatewayInterface {


    public String createPaymentLink(Long amount, String userName, String emailId, String PhoneNumber);


    public PaymentStuatus getPaymentStatus();

}
