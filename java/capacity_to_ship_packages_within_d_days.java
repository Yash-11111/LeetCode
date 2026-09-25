// ======================================
// LeetCode Problem: capacity to ship packages within d days
// Language: java
// Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
// Synced by: LinkCode
// Date: 9/25/2026, 9:37:10 PM
// ======================================


class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max =0;
        int sum =0;
        for(int num:weights) {
        if(num>max) max = num;
        sum +=num;
        }
        int low =max ;
        int high = sum;

        while(low<=high){
            int mid = low+(high-low)/2;

            int noDays = capa(weights,mid);
            if(noDays<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int capa(int[] nums,int cap ){
        int days =1; 
        int load =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+load>cap){
                days++;
                load=nums[i];
            }else{
                load+=nums[i];
            }
        }
        return days;
    }
}