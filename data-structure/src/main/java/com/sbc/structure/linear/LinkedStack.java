package com.sbc.structure.linear;

import java.util.Stack;

/**
 * @author songbaicheng
 * @description 带头结点的链栈
 * @date 2023/7/25 23:28
 */
public class LinkedStack<E> extends Stack<E> {

    /**
     * 存储链表
     */
    private LNode<E> head = null;

    /**
     * 初始化头结点
     */
    public LinkedStack() {
        head = new LNode<>(null);
    }

    /**
     * 入栈
     * @param item 入栈元素
     * @return 入栈元素
     */
    @Override
    public E push(E item) {
        LNode<E> node = new LNode<>(item);

        if (head.next != null) {
            node.next = head.next;
        }

        head.next = node;
        return item;
    }

    /**
     * 出栈
     * @return 出栈元素
     */
    @Override
    public synchronized E pop() {

        E temp = head.next.data;
        head.next = head.next.next;

        return temp;
    }

    /**
     * 查找栈顶元素
     * @return 栈顶元素
     */
    @Override
    public synchronized E peek() {
        return head.next.data;
    }

    /**
     * 判断是否栈空
     * @return 是否栈空
     */
    @Override
    public boolean empty() {
        return head.next == null;
    }
}
