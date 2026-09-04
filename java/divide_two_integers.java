// ======================================
// LeetCode Problem: divide two integers
// Language: java
// Link: https://leetcode.com/problems/divide-two-integers/
// Synced by: LinkCode
// Date: 9/4/2026, 9:28:07 PM
// ======================================


class Solution {
    public int divide(int a, int b) {
        if(a==-2147483648 && b== -1) return 2147483647;
        return a/b;
    }
}