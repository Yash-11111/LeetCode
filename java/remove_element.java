// ======================================
// LeetCode Problem: remove element
// Language: java
// Link: https://leetcode.com/problems/remove-element/
// Synced by: LinkCode
// Date: 9/27/2026, 10:33:02 PM
// ======================================


class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}