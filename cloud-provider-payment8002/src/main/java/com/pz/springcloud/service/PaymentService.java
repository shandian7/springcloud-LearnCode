package com.pz.springcloud.service;

import com.pz.springcloud.domain.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
