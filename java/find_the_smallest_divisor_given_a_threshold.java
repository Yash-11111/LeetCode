// ======================================
// LeetCode Problem: find the smallest divisor given a threshold
// Language: java
// Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
// Synced by: LinkCode
// Date: 9/24/2026, 8:50:06 PM
// ======================================


class Solution {
    public int smallestDivisor(int[] nums, int limit) {
       int low=1;
        int high = 0;
        for(int num:nums) if(num>high) high = num;
        int ans = high;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(getsum(nums,mid)<=limit){
                ans = mid ;
                high=mid-1;
            }else{
                low=mid+1;
            }

        }       
        return ans;
    }
    public int getsum(int [] nums,int divisor){
        int sum = 0;
        for(int num:nums){
            sum += (num + divisor-1)/divisor;
        }
        return sum ;
    }
}