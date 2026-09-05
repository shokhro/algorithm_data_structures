package org.example.src.leetcode;

public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k){
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }

        double res = sum;
        for (int i = k; i < nums.length; i++){
            sum += nums[i] - nums[i - k];
            res = Math.max(res, sum);
        }
        return res / k;


//        int[] sums = new int[nums.length];
//        sums[0] = nums[0];
//        for (int i = 1; i < sums.length; i++){
//            sums[i] = sums[i - 1] + nums[i];
//        }
//
//        double res = nums[k-1] * 1.0 / k;
//        for (int i = k; i < sums.length; i++){
//            res = Math.max(res, (sums[i] - sums[i - k]));
//        }
//
//        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,12,-5,-6,50,3};
        int k = 4;
        FindMaxAverage fma = new FindMaxAverage();
        System.out.println(fma.findMaxAverage(nums, k));
    }
}
