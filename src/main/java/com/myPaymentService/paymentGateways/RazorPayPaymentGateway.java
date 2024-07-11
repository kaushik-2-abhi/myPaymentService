package com.myPaymentService.paymentGateways;


import com.myPaymentService.model.PaymentStuatus;
import org.springframework.stereotype.Service;

@Service
public class RazorPayPaymentGateway implements PaymentGatewayInterface {

    public String createPaymentLink(Long amount, String userName, String emailId, String PhoneNumber){
        return "";
    }

    public PaymentStuatus getPaymentStatus(){
        return null;
    }
}
