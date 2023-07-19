package com.sbc.structure.linear;

import org.junit.jupiter.api.Test;

/**
 * @author songbaicheng
 * @description 双链表测试类
 * @date 2023/7/19 22:02
 */
class DNodeTest {

    /**
     * 双链表插入元素，有头结点
     * @param head 双链表
     * @param target 目标位置
     * @param element 待插入元素
     * @param <T> 元素类型
     */
    private <T> void insertNode(DNode<T> head, int target, T element) {

        // 安全性校验
        if (target < 0) {
            return;
        }

        DNode<T> flagNode = head.next;

        for (int i = 1; i < target; i++) {
            flagNode = flagNode.next;
        }

        if (flagNode == null || flagNode.next == null) {
            return;
        }

        DNode<T> newNode = new DNode<>(element);
        flagNode.next.prior = newNode;
        newNode.next = flagNode.next;
        newNode.prior = flagNode;
        flagNode.next = newNode;
    }

    /**
     * 双链表删除元素，有头结点
     * @param head 双链表
     * @param target 目标位置
     * @param <T> 元素类型
     */
    private <T> void deleteNode(DNode<T> head, int target) {

        // 安全性校验
        if (target < 0) {
            return;
        }

        DNode<T> flagNode = head.next;

        for (int i = 1; i < target; i++) {
            flagNode = flagNode.next;
        }

        if (flagNode == null || flagNode.next == null) {
            return;
        }

        flagNode.next = flagNode.next.next;
        flagNode.next.prior = flagNode;
    }

    @Test
    void insertTest() {

        DNode<Integer> head = new DNode<>(null);
        DNode<Integer> flagNode = head;

        for (int i = 0; i < 5; i++) {
            DNode<Integer> newNode = new DNode<>(i);

            flagNode.next = newNode;
            newNode.prior = flagNode;
            flagNode = flagNode.next;
        }

        insertNode(head, 3, 9);
//        deleteNode(head, 2);

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}