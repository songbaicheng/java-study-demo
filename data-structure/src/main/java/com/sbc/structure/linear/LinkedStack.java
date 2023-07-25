package com.sbc.structure.linear;

import java.util.Stack;

/**
 * @author songbaicheng
 * @description 带头结点的链栈
 * @date 2023/7/25 23:28
 */
public class LinkedStack<E> extends Stack<E> {

    private LNode<E> head = null;

    public LinkedStack() {
        head = new LNode<>(null);
    }

    @Override
    public E push(E item) {
        LNode<E> node = new LNode<>(item);

        if (head.next != null) {
            node.next = head.next;
        }

        head.next = node;
        return item;
    }

    @Override
    public synchronized E pop() {

        E temp = head.next.data;
        head.next = head.next.next;

        return temp;
    }

    @Override
    public synchronized E peek() {
        return head.next.data;
    }

    @Override
    public boolean empty() {
        return head.next == null;
    }

}
