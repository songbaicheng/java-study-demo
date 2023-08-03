package com.sbc.MyCalculator;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @ClassName MyCalculator
 * @Description 简单的加法计算器
 * @Author songbaicheng
 * @Date 2023/8/3 10:53
 */
@WebService
public class MyCalculator {

    @WebMethod
    public int add(int a, int b) {
        return a + b;
    }
}

