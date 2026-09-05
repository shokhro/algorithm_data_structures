package org.example.src.leetcode;

public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k){
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < sums.length; i++){
            sums[i] = sums[i - 1] + nums[i];
        }

        double res = nums[k-1] * 1.0 / k;
        for (int i = k; i < sums.length; i++){
            res = Math.max(res, (sums[i] - sums[i - k]));
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,12,-5,-6,50,3};
        int k = 4;
        FindMaxAverage fma = new FindMaxAverage();
        System.out.println(fma.findMaxAverage(nums, k));
    }

    //        int[] sums = new int[nums.length];
    //        sums[0] = nums[0];
    //        for (int i = 1; i < nums.length; i++) {
    //            sums[i] = sums[i-1] + nums[i];
    //        }
    //
    //        int maxSum = sums[k-1];
    //        for (int i = k; i < nums.length; i++) {
    //            int windowSum = sums[i] - sums[i-k];
    //            maxSum = Math.max(maxSum, windowSum);
    //        }
    //        return (double) maxSum / k;
}
