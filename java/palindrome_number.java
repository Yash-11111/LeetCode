// ======================================
// LeetCode Problem: palindrome number
// Language: java
// Link: https://leetcode.com/problems/palindrome-number/
// Synced by: LinkCode
// Date: 8/29/2026, 11:18:57 PM
// ======================================


class Solution {
    public boolean isPalindrome(int x) {
        if(x==0)return true;
        int ori =x;
        int rev=0;
        while(x>0){
            int temp = x%10;
            x /=10;
            rev = (rev*10)+temp;

        }
        if(ori==rev) return true;
        return false;
    }
}