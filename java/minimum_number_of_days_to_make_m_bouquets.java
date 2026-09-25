// ======================================
// LeetCode Problem: minimum number of days to make m bouquets
// Language: java
// Link: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
// Synced by: LinkCode
// Date: 9/25/2026, 3:42:44 PM
// ======================================


class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int size = bloomDay.length;
        if((long)m*k>size) return -1;
        int low =1;
        int high =0;
        for(int num:bloomDay) if(num>high) high = num;
       
        while(low<=high){
            int mid = low+(high-low)/2;
            if(getbloom(bloomDay,mid,m,k)){
                high = mid-1;
            }else{
                low=mid+1;
            }

        }
        return low;

    }
    public boolean getbloom(int nums[],int div,int m,int k){
       
        int bou=0;
        int con =0;
        for(int num:nums){
            if(num<=div){
                con++;
                if(con==k){
                    bou++;
                    con=0;
                }
            }else{
                con=0;
            }
        }
        return bou>=m;
    }
}