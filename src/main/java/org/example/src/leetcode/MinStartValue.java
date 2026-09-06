package org.example.src.leetcode;

public class MinStartValue {
        public int minStartValue(int[] nums) {
            int prefixSum = 0;
            int minPrefixSum = 0;

            for(int num : nums){
                prefixSum = prefixSum + num;
                minPrefixSum = Math.min(minPrefixSum, prefixSum);
            }

            return Math.max(1, 1 - minPrefixSum);
        }
}
