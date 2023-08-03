package com.sbc;

import com.sbc.MyCalculator.MyCalculator;

import javax.xml.ws.Endpoint;

/**
 * @ClassName WebServiceSeverMain
 * @Description Web Service 服务主函数
 * @Author songbaicheng
 * @Date 2023/8/3 10:58
 */
public class WebServiceSeverMain {

    public static void main(String[] args) {

        // 定义Web服务的地址
        String url = "http://localhost:8080/calculator";

        // 创建Calculator对象
        MyCalculator calculator = new MyCalculator();

        // 发布Web服务
        Endpoint.publish(url, calculator);

        System.out.println("Web服务已发布，访问地址: " + url + "?wsdl");
    }
}
