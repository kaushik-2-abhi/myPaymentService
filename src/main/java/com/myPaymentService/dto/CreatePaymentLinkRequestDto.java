package com.myPaymentService.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CreatePaymentLinkRequestDto {

  Long orderId;
}
