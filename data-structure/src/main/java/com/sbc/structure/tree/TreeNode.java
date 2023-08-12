package com.sbc.structure.tree;

/**
 * @author songbaicheng
 * @description 二叉树的链式存储
 * @date 2023/8/12 18:54
 */
public class TreeNode<E> {

    /**
     * 数据域
     */
    E data;
    /**
     * 左孩子指针
     */
    TreeNode<E> lChild;
    /**
     * 右孩子指针
     */
    TreeNode<E> rChild;
}
