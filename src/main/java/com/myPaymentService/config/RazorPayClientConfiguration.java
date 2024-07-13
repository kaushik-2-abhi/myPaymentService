package com.myPaymentService.config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.context.annotation.Bean;

public class RazorPayClientConfiguration {

    String Key="key";
    String secretId="id";

    @Bean
    public RazorpayClient getRazorPayClient() throws RazorpayException {
        RazorpayClient razorpayClient=new RazorpayClient(Key, secretId);
        return razorpayClient;
    }
}
