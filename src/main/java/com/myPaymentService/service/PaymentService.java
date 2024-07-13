package com.myPaymentService.service;

import com.myPaymentService.model.PaymentStuatus;
import com.myPaymentService.paymentGateways.PaymentGatewayInterface;
import com.myPaymentService.paymentGateways.RazorPayPaymentGateway;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayException;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String createPaymentLink(Long id) throws JSONException, RazorpayException {


//        I need order details to create payment link
//          RestTemplate restTemplate=new RestTemplate();
//          Order order=  restTemplate.getForObject("orderServiceUrl"+id, Order.Class);
//          long orderId=order.getAmount;
//          String userName=order.getUserName();
//          String email=order.getEmailId();
//          String PhoneNumber=order.getPhoneNumber();

        Long amount=1000L;
        String userName="Abhishek Kaushik";
        String email="kaushik2abhI@gmail.com";
        String phoneNumber="+91XXXXXXXXXX";


        PaymentGatewayInterface paymentGateWaysInterface=new RazorPayPaymentGateway();
        PaymentLink paymentLink= paymentGateWaysInterface.createPaymentLink(amount,userName,email,phoneNumber);
     return  "";
    }


    public PaymentStuatus checkPaymentStatus(Long paymentId){
        return PaymentStuatus.SUCCESS;
    }
}
