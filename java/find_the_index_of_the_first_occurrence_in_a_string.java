// ======================================
// LeetCode Problem: find the index of the first occurrence in a string
// Language: java
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Synced by: LinkCode
// Date: 9/4/2026, 9:28:28 PM
// ======================================


class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}