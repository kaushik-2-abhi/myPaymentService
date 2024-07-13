package com.myPaymentService.paymentGateways;

import com.myPaymentService.model.PaymentStuatus;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayException;
import org.springframework.boot.configurationprocessor.json.JSONException;

public interface PaymentGatewayInterface {


    public PaymentLink createPaymentLink(Long amount, String userName, String emailId, String PhoneNumber) throws JSONException, RazorpayException;


    public PaymentStuatus getPaymentStatus();

}
