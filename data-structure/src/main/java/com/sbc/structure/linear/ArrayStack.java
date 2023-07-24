package com.sbc.structure.linear;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author songbaicheng
 * @description 用数组实现的顺序栈
 * @date 2023/7/24 23:19
 */
public class ArrayStack<E> extends Stack<E> implements Iterable<E> {

    /**
     * 栈顶指针
     */
    private int top;
    /**
     * 栈内数组
     */
    private final E[] data;

    /**
     * 初始化栈
     * @param capacity
     */
    public ArrayStack(int capacity) {
        this.data = (E[]) new Object[capacity];
        this.top = -1;
    }

    @Override
    public E push(E item) {

        // 判断栈内是否还有空间
        if (this.top == data.length - 1) {
            return null;
        }
        data[++top] = item;
        return super.push(item);
    }

    /**
     * 出栈
     * @return 栈顶元素
     */
    @Override
    public synchronized E pop() {
        return data[top--];
    }

    /**
     * 获取栈顶元素
     * @return 栈顶元素
     */
    @Override
    public synchronized E peek() {
        return data[top];
    }

    /**
     * 栈判空
     * @return 是否为空栈
     */
    @Override
    public boolean empty() {
        return this.top == -1;
    }

    @Override
    public synchronized Iterator<E> iterator() {
        return null;
    }
}
