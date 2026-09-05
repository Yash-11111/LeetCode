// ======================================
// LeetCode Problem: valid parentheses
// Language: java
// Link: https://leetcode.com/problems/valid-parentheses/
// Synced by: LinkCode
// Date: 9/5/2026, 10:40:11 PM
// ======================================


class Solution {
    public boolean isValid(String s) {
       int a =0; 
       int b=0;
       int c=0;
       ArrayList<Integer> lst = new ArrayList<>();
       char [] arr = s.toCharArray();
       for(int i=0;i<s.length();i++){
            if(arr[i]=='('){
                a+=1;
                lst.add(1);
            }
            if(arr[i]==')'){
                a-=1;
                if(a<0) return false;
                if(lst.get(lst.size()-1)!=1) return false;
                lst.removeLast();
            }
            if(arr[i]=='{'){
                b+=1;
                lst.add(2);
            }
            if(arr[i]=='}'){
                b-=1;
                if(b<0) return false;
                if(lst.get(lst.size()-1)!=2) return false;
                lst.removeLast();
            }
            if(arr[i]=='['){
                c+=1;;
                lst.add(3);
            }
            if(arr[i]==']'){
                c-=1;
                if(c<0) return false;
                if(lst.get(lst.size()-1)!=3) return false;
                lst.removeLast();
            }
            System.out.println(a+" "+b+" "+c);
            if(a<0 || b<0 || c<0) return false;
       }
       if(a==0 && b==0 && c==0) return true;
       return false;
    }
}