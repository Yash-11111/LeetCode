// ======================================
// LeetCode Problem: single element in a sorted array
// Language: java
// Link: https://leetcode.com/problems/single-element-in-a-sorted-array/
// Synced by: LinkCode
// Date: 8/24/2026, 4:40:17 PM
// ======================================


class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length - 1;
        int low = 0;
        int high = n;

        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n] != nums[n - 1]) return nums[n];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if (nums[mid] == nums[mid - 1]) {
                if ((mid - low) % 2 == 0) high = mid - 2;
                else low = mid + 1;
            } else {
                if ((mid - low) % 2 == 0) low = mid + 2;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
