package com;

import java.util.Arrays;

public class arrSort {

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
	//快速排序
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
	
	   //冒泡排序
    public int[] bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //选择排序
    public int[] selectionSort(int[] arr) {
        int len = arr.length;
        int minIndex, temp;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                //未排序中找出最小的数
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    //插入排序
    public int[] insertionSort(int[] arr) {
        int len = arr.length;
        int preIndex, current;
        for (int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }

    //希尔排序
    public int[] shellSort(int[] arr) {
        int len = arr.length;
        int gap = 1;
        int temp;
        //动态定义间隔序列
        while (gap < len/3){
            gap = gap*3 + 1;
        }
        for(int g = gap;g > 0;g = (int) Math.floor(gap/3)) {
            for (int i = g; i < len; i++) {
                temp = arr[i];
                for (int j = i - g; j > 0 && arr[j] >temp ; j -= g) {
                    arr[j + g] = arr[j];
                }
                arr[i + g] = temp;
            }
        }
        return arr;
    }

    //归并排序
    public int[] mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }
        int middle = (int) Math.floor(len/2);
        int[] left = new int[middle];
        int[] right = new int[len - middle];
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int i = middle; i < len - 1; i++) {
            right[i-middle] = arr[i];
        }
        return merge(mergeSort(left), mergeSort(right));
    }
    int[] merge(int[] left, int[] right) {
        List leftList = Arrays.asList(left);
        List rightList = Arrays.asList(right);
        List<Integer> result = new ArrayList<>();
        while (leftList.size() > 0 && rightList.size() > 0) {
            if ((Integer)leftList.get(0) <= (Integer) rightList.get(0)) {
                result.add((Integer) leftList.get(0));
                leftList.remove(0);
            }else {
                result.add((Integer) rightList.get(0));
                rightList.remove(0);
            }
        }
        while (leftList.size() > 0) {
            result.add((Integer) leftList.get(0));
            leftList.remove(0);
        }
        while (rightList.size() > 0) {
            result.add((Integer) rightList.get(0));
            rightList.remove(0);
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size() - 1; i++) {
            arr[i] = result.get(0);
        }
        return arr;
    }
}
