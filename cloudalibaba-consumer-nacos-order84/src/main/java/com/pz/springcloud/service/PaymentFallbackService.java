package com.pz.springcloud.service;

import com.pz.springcloud.domain.CommonResult;
import com.pz.springcloud.domain.Payment;

public class PaymentFallbackService implements PaymentService{


    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,
                "服务降级返回,----PaymentFallbackService",
                new Payment(id,"errorSerial"));
    }
}
