package com.payment.payment.impl;

import com.payment.payment.dto.PaymentDto;
import com.payment.payment.entity.PaymentEntity;
import com.payment.payment.repository.PaymentRepository;
import com.payment.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public PaymentDto doPayment(PaymentDto paymentDto) {
        PaymentEntity paymentEntity=new PaymentEntity();
        paymentEntity.setPaymentId(paymentDto.getPaymentId());
        paymentEntity.setPaymentStatus(paymentDto.getPaymentStatus());
        paymentEntity.setTransactionId(paymentDto.getTransactionId());
        paymentEntity.setOrderId(paymentDto.getOrderId());
        paymentEntity.setAmount(paymentDto.getAmount());
        paymentRepository.save(paymentEntity);
        return paymentDto;
    }

    public String payMentProcessing()
    {
        return new Random().nextBoolean()?"Success":"Failure";
    }
}
