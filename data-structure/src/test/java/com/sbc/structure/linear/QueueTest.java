package com.sbc.structure.linear;

import org.junit.jupiter.api.Test;

/**
 * @author songbaicheng
 * @description 循环队列测试类
 * @date 2023/7/30 21:56
 */
class QueueTest {

    private Queue<Integer> queue = new Queue<>(10);

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
        // 长度
        System.out.println(queue.length());
        // 出队
        System.out.println(queue.poll());
        // 长度
        System.out.println(queue.length());
        // 判空
        System.out.println(queue.isEmpty());
    }

    @Test
    public void fullTest() {
        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }

        System.out.println(queue.isFull());
    }
}