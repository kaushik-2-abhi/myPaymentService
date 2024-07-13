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

    @Bean
    public RazorpayClient getRazorPayClient() throws RazorpayException {
        try{
        RazorpayClient razorpayClient=new RazorpayClient(keyId, secretId,true); return razorpayClient;
        }
        catch (RazorpayException e){
            e.printStackTrace();
            System.out.println(e);;

        }

        return null;
    }
}
