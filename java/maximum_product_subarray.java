// ======================================
// LeetCode Problem: maximum product subarray
// Language: java
// Link: https://leetcode.com/problems/maximum-product-subarray/
// Synced by: LinkCode
// Date: 8/18/2026, 10:01:35 PM
// ======================================


class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];

        int prod =Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
        int curr=1;
            for(int j=i;j<nums.length;j++){
                curr*=nums[j];

                prod=Math.max(prod,curr);
                
            }
        }
        return prod;
    }
}