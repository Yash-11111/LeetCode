// ======================================
// LeetCode Problem: find peak element
// Language: java
// Link: https://leetcode.com/problems/find-peak-element/
// Synced by: LinkCode
// Date: 8/25/2026, 11:03:52 PM
// ======================================


class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0 ; 
        int high =nums.length-1;
     
        while(low<high){
            int mid =  low + (high - low )/2;
            if(nums[mid]>nums[mid+1]){
                high = mid;
            }else{
                low=mid+1;
            }
        }
        return low;

    }
}