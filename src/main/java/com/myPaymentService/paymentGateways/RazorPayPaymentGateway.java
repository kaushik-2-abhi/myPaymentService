package com.myPaymentService.paymentGateways;


import com.myPaymentService.model.PaymentStuatus;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class RazorPayPaymentGateway implements PaymentGatewayInterface {

 //   @Autowired
//    RazorpayClient razorpayClient;

    public String createPaymentLink(Long amount, String userName, String emailId, String PhoneNumber) throws JSONException, RazorpayException {
//        JSONObject paymentLinkRequest = new JSONObject();
//        paymentLinkRequest.put("amount",1000);
//        paymentLinkRequest.put("currency","INR");
//        paymentLinkRequest.put("expire_by",1691097057);
//        paymentLinkRequest.put("reference_id","TS1989");
//        paymentLinkRequest.put("description","Payment for policy no #23456");
//        JSONObject customer = new JSONObject();
//        customer.put("name","+919999999999");
//        customer.put("contact","Gaurav Kumar");
//        customer.put("email","gaurav.kumar@example.com");
//        paymentLinkRequest.put("customer",customer);
//        JSONObject notify = new JSONObject();
//        notify.put("sms",true);
//        notify.put("email",true);
//        paymentLinkRequest.put("reminder_enable",true);
//        JSONObject notes = new JSONObject();
//        notes.put("policy_name","Jeevan Bima");
//        paymentLinkRequest.put("notes",notes);
//        paymentLinkRequest.put("callback_url","https://example-callback-url.com/");
//        paymentLinkRequest.put("callback_method","get");
//
//        PaymentLink payment =razorpayClient.paymentLink.create(paymentLinkRequest);
//
//
//
//        return payment.toString();
        return "";
    }

    public PaymentStuatus getPaymentStatus(){
        return null;
    }
}
