// ======================================
// LeetCode Problem: binary search
// Language: java
// Link: https://leetcode.com/problems/binary-search/
// Synced by: LinkCode
// Date: 8/18/2026, 10:03:47 PM
// ======================================


class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low = mid+1;

            } else{
                high = mid-1;
            }
        }
        return -1;

    }
}