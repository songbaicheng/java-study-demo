package com.sbc.structure.linear;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

/**
 * @author songbaicheng
 * @description 顺序表结构测试
 * @date 2023/7/15 22:55
 */
class SequenceListTest {

    private SequenceList<Integer> list = new SequenceList<>(10);

    @Test
    void clear() {
        list.insert(5);
        list.clear();
        System.out.println(list.get(0));
    }

    @Test
    void isEmpty() {
        System.out.println(list.isEmpty());
        list.insert(3);
        System.out.println(list.isEmpty());
    }

    @Test
    void length() {
        System.out.println(list.length());
        list.insert(3);
        System.out.println(list.length());
    }

    @Test
    void get() {
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println(list.get(0));
        System.out.println(list.get(3));
        System.out.println(list.get(5));
    }

    @Test
    void remove() {
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.remove(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }

    @Test
    void indexOf() {
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2, 7);
        list.insert(6,8);
        list.insert(2,5);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}