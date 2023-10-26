package com.sbc.algorithms.sort;

/**
 * @author songbaicheng
 * @description 插入排序
 * @date 2023/10/25 23:27
 */
public class InsertSort<E extends Comparable<E>> {

    public void insertSort(E[] arr) {
        for (int i = 1; i < arr.length; i++) {

            E tempElement = arr[i];
            int j = i - 1;

            while (j >= 0 && tempElement.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = tempElement;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {12, 11, 13, 5, 6};
        InsertSort<Integer> is = new InsertSort<>();
        is.insertSort(arr);
        System.out.println("Sorted array");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
