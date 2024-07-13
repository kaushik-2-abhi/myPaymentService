package com.myPaymentService.config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorPayClientConfiguration {
    @Value("${RAZORPAY.KEY_ID}")
   private String keyId;

    @Value(("${RAZORPAY.KEY_SECRET}"))
   private String secretId;

//    @Bean
//    public RazorpayClient getRazorPayClient() throws RazorpayException {
//        try{
//        RazorpayClient razorpayClient=new RazorpayClient("rzp_test_w06Iua4sdQudcV","36RW6dXr5C9J0v1Dnml07J4A",true); return razorpayClient;
//        }
//        catch (RazorpayException e){
//            e.printStackTrace();
//            System.out.println(e);;
//
//        }
//
//        return null;
//    }

    @Bean
    public RazorpayClient getRazorPayClient() throws RazorpayException {
        // Let exceptions propagate to Spring for better diagnostics
        return new RazorpayClient("rzp_test_w06Iua4sdQudcV","36RW6dXr5C9J0v1Dnml07J4A");
    }



}
