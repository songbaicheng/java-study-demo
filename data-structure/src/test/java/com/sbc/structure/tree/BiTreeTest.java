package com.sbc.structure.tree;

import com.sbc.structure.linear.LinkedStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author songbaicheng
 * @description 二叉树遍历类测试
 * @date 2023/8/15 20:14
 */
class BiTreeTest {

    BiTree<Integer> root = new BiTree<>(1);

    @BeforeEach
    void setUp() {

        // 初始化二叉树
        final BiTree<Integer> l7 = new BiTree<>(7);
        final BiTree<Integer> r3 = new BiTree<>(3);
        final BiTree<Integer> l4 = new BiTree<>(4);
        final BiTree<Integer> l9 = new BiTree<>(9);
        final BiTree<Integer> r6 = new BiTree<>(6);
        final BiTree<Integer> l8 = new BiTree<>(8);

        l4.setRightChild(l8);
        l7.setLeftChild(l4);
        l7.setRightChild(l9);
        r3.setLeftChild(r6);
        root.setLeftChild(l7);
        root.setRightChild(r3);
    }

    /**
     * 前序遍历：
     * 1,7,4,8,9,3,6,
     * 中序遍历：
     * 4,8,7,9,1,6,3,
     * 后序遍历
     * 8,4,9,7,6,3,1,
     */
    @Test
    void test() {
        System.out.println("前序遍历：");
        preOrder(root);
        System.out.println("\n中序遍历：");
        inOrder(root);
        System.out.println("\n中序遍历：");
        inOrderByStack(root);
        System.out.println("\n后序遍历");
        postOrder(root);
        System.out.println();
    }

    /**
     * 前序遍历
     *
     * @param tree 遍历二叉树
     */
    private void preOrder(BiTree<Integer> tree) {
        if (tree != null) {
            System.out.print(tree.getData() + ",");
            preOrder(tree.getLeftChild());
            preOrder(tree.getRightChild());
        }
    }

    /**
     * 中序遍历
     *
     * @param tree 遍历二叉树
     */
    private void inOrder(BiTree<Integer> tree) {
        if (tree != null) {
            inOrder(tree.getLeftChild());
            System.out.print(tree.getData() + ",");
            inOrder(tree.getRightChild());
        }
    }

    /**
     * 非递归中序遍历
     *
     * @param tree 遍历二叉树
     */
    private void inOrderByStack(BiTree<Integer> tree) {

        final LinkedStack<BiTree<Integer>> stack = new LinkedStack<>();
        BiTree<Integer> root = tree;

        while (root != null || !stack.empty()) {
            if (root != null) {
                // 一路向左
                stack.push(root);
                root = root.getLeftChild();
            } else {
                // 出栈并开始转向出栈的右子树
                root = stack.pop();
                System.out.print(root.getData() + ",");
                root = root.getRightChild();
            }
        }
    }

    /**
     * 后序遍历
     *
     * @param tree 遍历二叉树
     */
    private void postOrder(BiTree<Integer> tree) {
        if (tree != null) {
            postOrder(tree.getLeftChild());
            postOrder(tree.getRightChild());
            System.out.print(tree.getData() + ",");
        }
    }

}