package com.sbc;

import com.sbc.mycalculator.MyCalculator;
import com.sbc.mycalculator.MyCalculatorService;

/**
 * @ClassName WebServiceCLientMain
 * @Description Web Service 客户端主函数
 * @Author songbaicheng
 * @Date 2023/8/3 15:06
 */
public class WebServiceCLientMain {

    public static void main(String[] args) {
        MyCalculatorService service = new MyCalculatorService();
        MyCalculator port = service.getMyCalculatorPort();

        int num1 = 10;
        int num2 = 20;
        int result = port.add(num1, num2);

        System.out.println("Result of adding " + num1 + " and " + num2 + " is: " + result);
    }
}
