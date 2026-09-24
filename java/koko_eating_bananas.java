// ======================================
// LeetCode Problem: koko eating bananas
// Language: java
// Link: https://leetcode.com/problems/koko-eating-bananas/
// Synced by: LinkCode
// Date: 9/24/2026, 10:28:17 PM
// ======================================


public class Solution {
    public int minEatingSpeed(int[] nums, int h) {
      int low =1;
      int high=0;

      for(int num:nums){
        if(num>high) high = num;
      }

    while(low<=high){
        int mid = low+(high-low)/2;
        if(getmin(nums,mid,h)){
            high = mid-1;
        }else{
            low = mid+1;
        }
    }

return low;
    }
    public boolean getmin(int [] nums,int div,int h){

        long sum =0;

        for(int num:nums){
            sum+=(num+div-1)/div;
        }

        return sum<=h;

    }
}