package com.myPaymentService.paymentGateways;


import com.myPaymentService.model.PaymentStuatus;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RazorPayPaymentGateway implements PaymentGatewayInterface {


    RazorpayClient razorpayClient;

    public RazorPayPaymentGateway(RazorpayClient razorpayClient) {
        this.razorpayClient = razorpayClient;
    }


    public PaymentLink createPaymentLink(Long amount, String userName, String emailId, String PhoneNumber,Long orderId) throws JSONException, RazorpayException {
        JSONObject paymentLinkRequest = new JSONObject();
        paymentLinkRequest.put("amount",1000L);
        paymentLinkRequest.put("currency","INR");
        paymentLinkRequest.put("accept_partial",false);
     //   paymentLinkRequest.put("first_min_partial_amount",100);
        paymentLinkRequest.put("expire_by",(System.currentTimeMillis() / 1000)+16*60);
        paymentLinkRequest.put("reference_id",orderId.toString());
        paymentLinkRequest.put("description","Payment for policy no #23456");
        JSONObject customer = new JSONObject();
        customer.put("name",userName);
        customer.put("contact",PhoneNumber);
        customer.put("email",emailId);
        paymentLinkRequest.put("customer",customer);
        JSONObject notify = new JSONObject();
        notify.put("sms",true);
        notify.put("email",true);
        paymentLinkRequest.put("reminder_enable",true);
//        JSONObject notes = new JSONObject();
//        notes.put("policy_name","Jeevan Bima");
//        paymentLinkRequest.put("notes",notes);
        paymentLinkRequest.put("callback_url","https://google.com");
        paymentLinkRequest.put("callback_method","get");


        PaymentLink payment = razorpayClient.paymentLink.create(paymentLinkRequest);


        return payment;

    }

    public PaymentStuatus getPaymentStatus() {
        return null;

    }

//    public static String getReferenceId(){
//        Random random = new Random();
//        Integer refId = random.nextInt(1, 10000);
//        String referenceId = refId.toString();
//        return referenceId;
//    }
}





