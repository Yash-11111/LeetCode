// ======================================
// LeetCode Problem: kth missing positive number
// Language: java
// Link: https://leetcode.com/problems/kth-missing-positive-number/
// Synced by: LinkCode
// Date: 9/25/2026, 11:15:24 PM
// ======================================


class Solution {
    public int findKthPositive(int[] arr, int k) {
 
    for(int i=0;i<arr.length;i++){
        if(arr[i]<=k) k++;
        else break;
    }
    return k;
    }
}