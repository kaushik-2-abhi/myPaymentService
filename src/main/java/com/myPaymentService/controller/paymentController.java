package com.myPaymentService.controller;

import com.myPaymentService.dto.CreatePaymentLinkRequestDto;
import com.myPaymentService.dto.CreatePaymentLinkResponseDto;
import com.myPaymentService.model.PaymentStuatus;
import com.myPaymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class paymentController {

    @Autowired
    private  PaymentService paymentService;

    @PostMapping("/createpaymentlink")
    public CreatePaymentLinkResponseDto createPaymentLink(CreatePaymentLinkRequestDto createPaymentLinkRequestDto){

        String paymentLink= paymentService.createPaymentLink(createPaymentLinkRequestDto.getOrderId());

        CreatePaymentLinkResponseDto response=new CreatePaymentLinkResponseDto();
        response.setPaymentLinkUrl(paymentLink);
        return response;


    }

    @GetMapping("/{Id}")
    public PaymentStuatus checkPaymentStatus(@PathVariable("Id") Long paymentId){


        return paymentService.checkPaymentStatus(paymentId);
    }


}











