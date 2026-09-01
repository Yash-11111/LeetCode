// ======================================
// LeetCode Problem: remove duplicates from sorted array
// Language: java
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Synced by: LinkCode
// Date: 9/1/2026, 10:04:44 PM
// ======================================


class Solution {
    public int removeDuplicates(int[] nums) {
      int ptr = 0;
      for(int i = 1;i<nums.length;i++){
        if(nums[ptr]!=nums[i]){
            nums[ptr+1]=nums[i];
            ptr++;
        }
      }
      return ptr+1;
    }
}