// ======================================
// LeetCode Problem: reverse integer
// Language: java
// Link: https://leetcode.com/problems/reverse-integer/
// Synced by: LinkCode
// Date: 8/28/2026, 7:59:50 PM
// ======================================


class Solution {
    public int reverse(int x) {
        int rev = 0;
        if (x == 0)
            return 0;
        boolean n = x < 0;
        if (n)
            x = -x;
        while (x > 0) {
            int last = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && last > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && last < -8))
                return 0;
            rev = (rev * 10) + last;

        }
        if (n)
            rev = -rev;
        return rev;
    }
}