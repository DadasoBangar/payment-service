package com.payment.payment.controller;

import com.payment.payment.dto.PaymentDto;
import com.payment.payment.entity.PaymentEntity;
import com.payment.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    @PostMapping("/makePayment")
    public PaymentDto doPayment(@RequestBody PaymentDto paymentDto)
    {
        paymentDto.setTransactionId(UUID.randomUUID().toString());
        return paymentService.doPayment(paymentDto);
    }



}
