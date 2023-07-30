package com.sbc.structure.linear;

/**
 * @author songbaicheng
 * @description 循环队列
 * @date 2023/7/30 21:08
 */
public class Queue<E> {

    /**
     * 队列最大容量
     */
    private final int maxSize;
    /**
     * 队列头指针
     */
    private int front;
    /**
     * 队列尾指针
     */
    private int rear;
    /**
     * 队列数组
     */
    private final Object[] arrayQueue;

    /**
     * 初始化队列
     *
     * @param maxSize 队列最大容量
     */
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        front = 0;
        rear = 0;
        arrayQueue = new Object[maxSize];
    }

    /**
     * 队列判空
     *
     * @return 队列是否为空
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * 队列判满
     *
     * @return 是否队列已满
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 入队操作
     *
     * @param element 入队元素
     */
    public void offer(E element) {

        // 队不满时，先送值到队尾元素，再将队尾指针加一
        if (!isFull()) {
            arrayQueue[rear] = element;
            rear = (rear + 1) % maxSize;
        }
    }

    /**
     * 出队操作
     *
     * @return 出队元素
     */
    public Object poll() {

        if (isEmpty()) {
            return null;
        }

        Object temp = arrayQueue[front];
        front = (front + 1) % maxSize;

        return temp;
    }

    /**
     * 返回队头元素
     *
     * @return 队头元素
     */
    public Object peek() {

        return isEmpty() ? arrayQueue[front] : null;
    }

    /**
     * 获取目前队列长度
     *
     * @return 队列长度
     */
    public int length() {

        return (rear + maxSize - front) % maxSize;
    }
}
