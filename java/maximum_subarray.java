// ======================================
// LeetCode Problem: maximum subarray
// Language: java
// Link: https://leetcode.com/problems/maximum-subarray/
// Synced by: LinkCode
// Date: 9/26/2026, 11:25:51 PM
// ======================================


class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            if (sum > max) {
                max = sum;
            }
            
            if (sum < 0) {
                sum = 0;
            }
        }
        
        return max;
    }
}