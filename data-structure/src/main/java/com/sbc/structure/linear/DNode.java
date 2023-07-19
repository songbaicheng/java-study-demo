package com.sbc.structure.linear;

/**
 * @author songbaicheng
 * @description 双链表
 * @date 2023/7/19 21:28
 */
public class DNode<T> {

    /**
     * 当前节点的值
     */
    public T data;
    /**
     * 前驱指针
     */
    public DNode<T> prior;
    /**
     * 后继指针
     */
    public DNode<T> next;

    /**
     * 初始化节点
     * @param data 节点的值
     */
    DNode (T data) {
        this.data = data;
        this.prior = null;
        this.next = null;
    }
}
