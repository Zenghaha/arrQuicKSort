package com;

import java.util.Arrays;

public class arrRemoveDuplicate {

    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1,1,2,3,4,5,3},
                {1,1,1,1,1,1,1},
                {1,2,3,3,2,1,4,4},
        };
        for (int[] arr : test) {
            System.out.println("before : " + Arrays.toString(arr));
            System.out.println("after : " + Arrays.toString(removeDuplicate(arr)));
        }

    }

    public static int[] removeDuplicate(int[] arr) {
        //先排序
        Arrays.sort(arr);

        int[] result = new int[arr.length];
        int pre = arr[0];
        result[0] = pre;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            if(pre != temp) {
                result[i] = temp;
            }
            pre = temp;
        }
        return result;
    }
}
