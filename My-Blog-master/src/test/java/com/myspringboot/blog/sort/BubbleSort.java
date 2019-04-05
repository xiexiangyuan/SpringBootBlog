package com.myspringboot.blog.sort;

/**
 * Created by xiexiangyuan on 2018/7/4.
 */
public class BubbleSort {

    //希尔排序、堆排序、快速排序、归并排序

    /**
     * 插入排序
     *
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int cur = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > cur) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = cur;
        }
        return arr;
    }

    /**
     * 希尔排序、插入排序的升级版本
     */
    public static int[] shellSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        int gap = arr.length / 2;
        while (gap > 0) {
            for (int i = 1; i < arr.length; i++) {
                int temp = arr[i];
                int p = i;
                while (p >= gap && arr[p - gap] > temp) {
                    arr[p] = arr[p - gap];
                    p -= gap;
                }
                arr[p] = temp;
            }
            gap = gap / 2;
        }
        return arr;
    }

    public static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[start];
            arr[start] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

        System.out.println("==>>index=" + bsort(arr, 16));
    }

    public static int bsort(int[] arr, int key) {
        int index = -1;
        if (arr == null || arr.length <= 0) {
            return index;
        }

        int start = 0, end = arr.length - 1;
        int mid = (start + end) / 2;
        System.out.println("==>>first mid=" + mid+";start="+start+";end="+end);
        while (start < end) {
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = (start + end) / 2;
            System.out.println("==>>mid=" + mid);
        }
        if (arr[mid] == key) {
            return mid;
        }
        return index;
    }
}
