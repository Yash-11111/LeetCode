// ======================================
// LeetCode Problem: sqrtx
// Language: java
// Link: https://leetcode.com/problems/sqrtx/
// Synced by: LinkCode
// Date: 9/22/2026, 7:57:10 PM
// ======================================


class Solution {
    public int mySqrt(int x) {
        long low =0;
        long high=x;
        while(low<=high){
            long mid = (low+high)/2;
            if(mid*mid==x) return (int) mid;
            else if(mid*mid >x) high = mid-1;
            else low=mid+1;

        }
        return (int)  high;
    }
}