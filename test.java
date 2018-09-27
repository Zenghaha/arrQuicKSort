package com;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int arr[] = {5,4,6,8,9,1,2,7,3,8,9,12};

        quickSort sort = new quickSort();
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
class quickSort {
    private int arr[];
    private int length;

    public void sort(int number[]) {
        if (null == number || number.length == 0) {
            return;
        }
        this.arr = number;
        length = number.length;
        sortTest(0,length - 1);

    }
    private void sortTest(int low, int high) {
        int a = low;
        int b = high;
        //取数组中间值
        int c = arr[low + (high - low) / 2];

        while (a <= b) {
            while (arr[a] < c) {
                a++;
            }
            while (arr[b] > c) {
                b--;
            }
            if (a <= b) {
                swap(a,b);
                a++;
                b--;
            }
        }
        if (low < b) {
            sortTest(low,b);
        }
        if(high > a) {
            sortTest(a,high);
        }
    }
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
