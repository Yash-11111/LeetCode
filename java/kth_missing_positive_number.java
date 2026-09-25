// ======================================
// LeetCode Problem: kth missing positive number
// Language: java
// Link: https://leetcode.com/problems/kth-missing-positive-number/
// Synced by: LinkCode
// Date: 9/25/2026, 11:05:36 PM
// ======================================


class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low =0;
        int high= arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int correctNo=mid+1;
            int missingNo = arr[mid] -correctNo;
            if(missingNo>=k) high = mid -1;
            else low = mid+1;
        }
        return high +1+k;
    }
}