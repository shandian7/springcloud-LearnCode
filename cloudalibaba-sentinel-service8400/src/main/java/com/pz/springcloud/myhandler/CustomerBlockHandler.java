package com.pz.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.pz.springcloud.domain.CommonResult;
import com.pz.springcloud.domain.Payment;

public class CustomerBlockHandler {

    public static CommonResult<Payment> handlerException(BlockException e){

        return new CommonResult(444,"按客户自定义,global handlerException---1");
    }

    public static CommonResult<Payment> handlerException2(BlockException e){

        return new CommonResult(444,"按客户自定义,global handlerException---2");
    }
}
