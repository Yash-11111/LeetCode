// ======================================
// LeetCode Problem: search insert position
// Language: java
// Link: https://leetcode.com/problems/search-insert-position/
// Synced by: LinkCode
// Date: 8/21/2026, 2:27:58 PM
// ======================================


class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0 ; i<nums.length;i++){
            if (nums[i]==target){
                return i;
            }

            if(nums[i]>target){
                return i;
            }

        }
            return nums.length;
    }
}