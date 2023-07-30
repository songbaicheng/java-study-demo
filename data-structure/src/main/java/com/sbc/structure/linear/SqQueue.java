package com.sbc.structure.linear;

/**
 * @author songbaicheng
 * @description 顺序存储队列
 * @date 2023/7/29 20:22
 */
public class SqQueue<E> {

    /**
     * 队列最大容量
     */
    private final int maxSize;
    /**
     * 队列头指针
     */
    private int font;
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
    public SqQueue(int maxSize) {
        this.maxSize = maxSize;
        font = 0;
        rear = 0;
        arrayQueue = new Object[maxSize];
    }

    /**
     * 队列判空
     *
     * @return 队列是否为空
     */
    public boolean isEmpty() {
        return font == rear;
    }

    /**
     * 队列判满
     *
     * @return 是否队列已满
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 入队操作
     *
     * @param element 入队元素
     */
    public void offer(E element) {

        // 队不满时，先送值到队尾元素，再将队尾指针加一
        if (!isFull()) {
            arrayQueue[rear++] = element;
        }
    }

    /**
     * 出队操作
     *
     * @return 出队元素
     */
    public Object poll() {

        return !isEmpty() ? arrayQueue[font++] : null;
    }

    /**
     * 返回队头元素
     *
     * @return 队头元素
     */
    public Object peek() {

        return !isEmpty() ? arrayQueue[font] : null;
    }
}
