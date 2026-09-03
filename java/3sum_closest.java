// ======================================
// LeetCode Problem: 3sum closest
// Language: java
// Link: https://leetcode.com/problems/3sum-closest/
// Synced by: LinkCode
// Date: 9/3/2026, 9:36:44 PM
// ======================================


class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);
        int cSum = 100000;
        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];

                if(Math.abs(target - sum) < Math.abs(target-cSum)){
                    cSum =sum;
                }
                if(sum>target) right--;
                else left++;
            }
        }
        return cSum;
    }
}