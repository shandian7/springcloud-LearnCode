package com.pz.springcloud.service;

import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("all")
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {

        return "------PaymentFallbackService fall back-paymentInfo_OK,o(T~T)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {

        return "------PaymentFallbackService fall back-paymentInfo_Timeout,o(T~T)o";
    }
}
