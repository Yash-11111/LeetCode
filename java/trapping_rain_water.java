// ======================================
// LeetCode Problem: trapping rain water
// Language: java
// Link: https://leetcode.com/problems/trapping-rain-water/
// Synced by: LinkCode
// Date: 9/8/2026, 11:30:41 PM
// ======================================


class Solution {
    public int trap(int[] height) {
        int[] a1=new int[height.length];
        int[] a2=new int[height.length];
        a1[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            a1[i]=Math.max(a1[i-1], height[i]);
        }
        a2[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            a2[i]=Math.max(a2[i+1], height[i]);
        }
        int ans=0;
        for(int i=0;i<height.length;i++)
        {
            ans+=Math.min(a1[i], a2[i])-height[i];
        }
        return ans;
    }
}