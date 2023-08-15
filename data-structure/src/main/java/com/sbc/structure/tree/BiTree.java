package com.sbc.structure.tree;

import lombok.Getter;
import lombok.Setter;

/**
 * @author songbaicheng
 * @description 二叉树的链式存储
 * @date 2023/8/12 18:54
 */
@Getter
@Setter
public class BiTree<E> {

    /**
     * 数据域
     */
    E data;
    /**
     * 左孩子指针
     */
    BiTree<E> leftChild;
    /**
     * 右孩子指针
     */
    BiTree<E> rightChild;

    /**
     * 初始化方法
     * @param data 数据域
     */
    public BiTree(E data) {
        this.data = data;
    }

}
