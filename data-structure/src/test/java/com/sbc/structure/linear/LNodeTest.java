package com.sbc.structure.linear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author songbaicheng
 * @description 单链表测试类
 * @date 2023/7/17 22:42
 */
class LNodeTest {

    /**
     * 没有头结点的头插法
     */
    @Test
    void headInsertNoHead() {
        LNode<Integer> head = null;

        for (int i = 0; i < 10; i++) {
            LNode<Integer> node = new LNode<>(i);
            node.next = head;
            head = node;
        }

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    /**
     * 有头结点的头插法
     */
    @Test
    void headInsertWithHead() {
        LNode<Integer> head = new LNode<>(null);

        for (int i = 0; i < 10; i++) {
            LNode<Integer> node = new LNode<>(i);
            node.next = head.next;
            head.next = node;
        }

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    /**
     * 有头结点的尾插法
     */
    @Test
    void tailInsertWithHead() {
        LNode<Integer> head = new LNode<>(null);
        // 方便每次找到插入点，创建尾结点指针
        LNode<Integer> listFlag = head;

        for (int i = 0; i < 10; i++) {
            listFlag.next = new LNode<>(i);
            listFlag = listFlag.next;
        }

        listFlag.next = null;

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    /**
     * 查找第target个结点，假设有头结点
     */
    private <T> LNode<T> getById(LNode<T> head, int target) {

        // 安全性校验
        if (target < 0) {
            return null;
        }

        LNode<T> currNode = head.next;
        int flag = 1;

        while (currNode != null && flag++ < target) {
            currNode = currNode.next;
        }

        return currNode;
    }

    @Test
    void getByIdTest() {
        LNode<Integer> head = new LNode<>(null);

        for (int i = 0; i < 10; i++) {
            LNode<Integer> node = new LNode<>(i);
            node.next = head.next;
            head.next = node;
        }

        LNode<Integer> lNode1 = getById(head, 5);
        assertNotNull(lNode1);
        System.out.println(lNode1.data); // 5
        LNode<Integer> lNode2 = getById(head, 11);
        assertNotNull(lNode2, "结点不存在！");
        System.out.println(lNode2.data); // 结点不存在！
    }

    /**
     * 前插法插入结点
     * @param head 单链表
     * @param target 插入位置
     * @param element 待插入元素
     * @param <T> 待定元素
     */
    private <T> void frontInsertNode(LNode<T> head, int target, T element) {

        // 安全性校验
        if (target < 0) {
            return;
        }

        // 获取前置结点
        LNode<T> node = getById(head, target - 1);

        if (node != null) {
            LNode<T> addNode = new LNode<>(element);
            addNode.next = node.next;
            node.next = addNode;
        }
    }

    /**
     * 后插法插入结点
     * @param head 单链表
     * @param target 插入位置
     * @param element 待插入元素
     * @param <T> 待定元素
     */
    private <T> void backInsertNode(LNode<T> head, int target, T element) {

        // 安全性校验
        if (target < 0) {
            return;
        }

        // 获取目标结点
        LNode<T> node = getById(head, target);

        if (node != null) {
            LNode<T> addNode = new LNode<>(element);
            addNode.next = node.next;
            node.next = addNode;
            addNode.data = node.data;
            node.data = element;
        }
    }

    @Test
    void insertTest() {
        LNode<Integer> head = new LNode<>(null);

        for (int i = 0; i < 10; i++) {
            LNode<Integer> node = new LNode<>(i);
            node.next = head.next;
            head.next = node;
        }

        frontInsertNode(head, 5, 11);

        while (head != null) {
            System.out.println(head.data);  // null 9 8 7 6 11 5 4 3 2 1 0
            head = head.next;
        }

        // 清空链表
        head = new LNode<>(null);;
        for (int i = 0; i < 10; i++) {
            LNode<Integer> node = new LNode<>(i);
            node.next = head.next;
            head.next = node;
        }

        backInsertNode(head, 5, 11);

        while (head != null) {
            System.out.println(head.data); // null 9 8 7 6 11 5 4 3 2 1 0
            head = head.next;
        }
    }

    /**
     *
     * @param head 单链表
     * @param <T> 元素类型
     * @return 链表长度
     */
    private <T> int getListLength(LNode<T> head) {

        int length = 0;

        while (head.next != null) {
            head = head.next;
            length++;
        }

        return length;
    }

    @Test
    void getListLengthTest() {
        LNode<Integer> head = new LNode<>(null);

        for (int i = 0; i < 10; i++) {
            LNode<Integer> node = new LNode<>(i);
            node.next = head.next;
            head.next = node;
        }

        System.out.println(getListLength(head)); // 10
    }

    /**
     * 前删法删除目标结点
     * @param head 单链表
     * @param target 目标顺序
     * @param <T> 元素类型
     */
    private <T> void frontDeleteNode(LNode<T> head, int target) {

        // 安全性校验
        if (target < 0) {
            return;
        }

        LNode<T> node = getById(head, target - 1);
        node.next = node.next.next;
    }

    /**
     * 后删法删除目标结点
     * @param head 单链表
     * @param target 目标顺序
     * @param <T> 元素类型
     */
    private <T> void backDeleteNode(LNode<T> head, int target) {

        // 安全性校验
        if (target < 0) {
            return;
        }

        LNode<T> node = getById(head, target);
        node.data = node.next.data;
        node.next = node.next.next;
    }

    @Test
    void deleteNodeTest() {
        LNode<Integer> head = new LNode<>(null);

        for (int i = 0; i < 10; i++) {
            LNode<Integer> node = new LNode<>(i);
            node.next = head.next;
            head.next = node;
        }

        frontDeleteNode(head, 5);

        while (head != null) {
            System.out.println(head.data); // null 9 8 7 6 4 3 2 1 0
            head = head.next;
        }

        head = new LNode<>(null);

        for (int i = 0; i < 10; i++) {
            LNode<Integer> node = new LNode<>(i);
            node.next = head.next;
            head.next = node;
        }

        frontDeleteNode(head, 5);

        while (head != null) {
            System.out.println(head.data); // null 9 8 7 6 4 3 2 1 0
            head = head.next;
        }
    }
}