// ======================================
// LeetCode Problem: median of two sorted arrays
// Language: java
// Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
// Synced by: LinkCode
// Date: 8/26/2026, 11:05:38 PM
// ======================================


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<nums1.length;i++){
            al.add(nums1[i]);
        }
        for(int i =0;i<nums2.length;i++){
            al.add(nums2[i]);
        }

        Collections.sort(al);
        int size = al.size();

       if(size%2==1){
        return (double) al.get(size/2);
       }else{
        int a = al.get((size/2)-1);
        int b = al.get((size/2));
       return (a+b) /2.0;
       }
    }
}