// ======================================
// LeetCode Problem: find minimum in rotated sorted array
// Language: java
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Synced by: LinkCode
// Date: 8/24/2026, 3:58:15 PM
// ======================================


class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];        
    }
}