package org.example.src.leetcode;

import java.util.Arrays;

public class PivotInteger {

    public int[] pivotInteger(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + i;
        }

        int[] arr2 = new int[n + 1];
        for (int i = n + 1; i > 1; i--) {

        }
        return arr;
    }

    public static void main(String[] args) {
        PivotInteger pt = new PivotInteger();
        System.out.println(Arrays.toString(pt.pivotInteger(8)));
    }


}
