package com.sbc.structure.linear;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @author songbaicheng
 * @description <TODO description class>
 * @date 2023/7/25 23:36
 */
class LinkedStackTest {

    Stack<Integer> stack = new LinkedStack<>();

    @Test
    void push() {
        stack.push(2);
        stack.push(4);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    @Test
    void pop() {
        stack.push(2);
        stack.push(4);
        System.out.println(stack.pop());

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    @Test
    void peek() {
        stack.push(2);
        stack.push(4);
        System.out.println(stack.peek());

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    @Test
    void empty() {
        System.out.println(stack.empty());

        stack.push(1);

        System.out.println(stack.empty());
    }
}