// ======================================
// LeetCode Problem: two sum
// Language: java
// Link: https://leetcode.com/problems/two-sum/
// Synced by: LinkCode
// Date: 8/18/2026, 9:45:46 PM
// ======================================


class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) return new int []{i,j};
            }
        }
        return new int[]{0,0};
    }
}