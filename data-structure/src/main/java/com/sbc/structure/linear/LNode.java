package com.sbc.structure.linear;

/**
 * @author songbaicheng
 * @description 单链表
 * @date 2023/7/17 21:22
 */
public class LNode<T> {

    /**
     * 当前节点的值
     */
    public T data;
    /**
     * 下一个节点的指针
     */
    public LNode<T> next;

    /**
     * 初始化节点
     * @param data 节点的值
     */
    LNode (T data) {
        this.data = data;
        this.next = null;
    }
}
