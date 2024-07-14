package com.myPaymentService.service;

import com.myPaymentService.model.Payment;
import com.myPaymentService.model.PaymentStuatus;
import com.myPaymentService.paymentGateways.PaymentGatewayInterface;
import com.myPaymentService.repository.PaymentsRepository;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Service;

import static com.myPaymentService.model.PaymentGateway.RAZORPAY;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayInterface paymentGatewayInterface;

    @Autowired
    private PaymentsRepository paymentsRepository;

    public String createPaymentLink(Long orderId) throws JSONException, RazorpayException {


//        I need order details to create payment link
//          RestTemplate restTemplate=new RestTemplate();
//          Order order=  restTemplate.getForObject("orderServiceUrl"+id, Order.Class);
//          long orderId=order.getAmount;
//          String userName=order.getUserName();
//          String email=order.getEmailId();
//          String PhoneNumber=order.getPhoneNumber();

        Long amount = 1000L;
        String userName = "Abhishek Kaushik";
        String email = "kaushik2abhI@gmail.com";
        String phoneNumber = "+91XXXXXXXXXX";


        PaymentLink paymentLink = paymentGatewayInterface.createPaymentLink(amount, userName, email, phoneNumber,orderId);

        Payment payment=Payment.builder()
                .orderId(orderId)
                .paymentUrl(paymentLink.get("short_url"))
                .paymentGateway(RAZORPAY)
                .paymentStuatus(PaymentStuatus.PENDING /*todo:when payments complete razorpay will send response via WEBHOOK as well as callbackURL*/)
                .UserId(123456L /* order.getUserId()*/)
                .amount(amount)
                .paymentGatewayReferenceId("Kau123fe5569vvk4")
                .callbackUrl("https://google.com")
                .build();

        paymentsRepository.save(payment);

        return paymentLink.get("short_url");

//      return  paymentLink.toString();

    }


    public PaymentStuatus checkPaymentStatus(String paymentId,Long orderId) throws RazorpayException {



           Payment payment= paymentsRepository.findByOrderId(orderId);
           PaymentStuatus paymentStuatus=paymentGatewayInterface.getPaymentStatus(paymentId);
           payment.setPaymentStuatus(paymentStuatus);
            paymentsRepository.save(payment);

           return  paymentStuatus ;






    }
}
