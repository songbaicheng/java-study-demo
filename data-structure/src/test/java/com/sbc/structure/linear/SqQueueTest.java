package com.sbc.structure.linear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author songbaicheng
 * @description 顺序队列测试类
 * @date 2023/7/29 21:11
 */
class SqQueueTest {

    SqQueue<Integer> queue = new SqQueue<>(10);

    @Test
    public void test() {
        // 判空
        System.out.println(queue.isEmpty());
        // 入队
        queue.offer(2);
        // 判空
        System.out.println(queue.isEmpty());
        // 队头元素
        System.out.println(queue.peek());
        // 出队
        System.out.println(queue.poll());
        // 判空
        System.out.println(queue.isEmpty());
    }
}