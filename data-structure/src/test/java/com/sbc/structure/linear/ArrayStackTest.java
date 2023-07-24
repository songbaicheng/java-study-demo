package com.sbc.structure.linear;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @author songbaicheng
 * @description 顺序栈测试类
 * @date 2023/7/25 00:16
 */
class ArrayStackTest {

    Stack<Integer> stack = new ArrayStack(10);

    @Test
    void push() {
        stack.push(2);
        stack.push(4);

        stack.forEach(System.out::println);
    }

    @Test
    void pop() {
        stack.push(2);
        stack.push(4);
        System.out.println(stack.pop());

        stack.forEach(System.out::println);
    }

    @Test
    void peek() {
        stack.push(2);
        stack.push(4);
        System.out.println(stack.peek());

        stack.forEach(System.out::println);
    }

    @Test
    void empty() {
        System.out.println(stack.empty());

        stack.push(1);

        System.out.println(stack.empty());
    }
}