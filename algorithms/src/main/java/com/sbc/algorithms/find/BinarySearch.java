package com.sbc.algorithms.find;

/**
 * @author songbaicheng
 * @description 二分查找/折半查找
 * @date 2023/10/15 22:37
 */
public class BinarySearch {

    public static <T extends Comparable<T>> T binarySearch(T[] array, T target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = target.compareTo(array[mid]);

            if (result == 0) {
                return target;
            } else if (result < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        final Integer[] ints = {7, 10, 13, 16, 19, 29, 32, 33, 37, 41, 43};

        System.out.println(binarySearch(ints, 17));
    }
}
