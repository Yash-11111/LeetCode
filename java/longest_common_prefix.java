// ======================================
// LeetCode Problem: longest common prefix
// Language: java
// Link: https://leetcode.com/problems/longest-common-prefix/
// Synced by: LinkCode
// Date: 8/30/2026, 10:40:21 PM
// ======================================


class Solution {
    public String longestCommonPrefix(String[] v) {
      Arrays.sort(v);
      StringBuffer a = new StringBuffer();
     char[] first = v[0].toCharArray();
     char [] last = v[v.length-1].toCharArray();

     for(int i=0;i<first.length;i++){
        if(first[i]!=last[i]){
            break;
        }
        a.append(first[i]);
     }
     return a.toString();

    }
}