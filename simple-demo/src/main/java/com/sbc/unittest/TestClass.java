package com.sbc.unittest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName TestClass
 * @Description 测试 PowerMock 类
 * @Author songbaicheng
 * @Date 2023/8/14 10:46
 */
public class TestClass {

    public String getUUID() {
        return UUID.randomUUID().toString();
    }

    public List<Integer> soutArray() {

        return new ArrayList<Integer>() {
            {
                add(2);
            }
        };
    }
}