package com.payment.payment.service;

import com.payment.payment.dto.PaymentDto;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    PaymentDto doPayment(PaymentDto paymentDto);
}
