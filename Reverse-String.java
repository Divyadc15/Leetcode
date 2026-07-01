1class Solution {
2    public void reverseString(char[] s) {
3        int i=0;
4        int j=s.length-1;
5        while(i<j){
6            char temp=s[i];
7            s[i]=s[j];
8            s[j]=temp;
9
10            i=i+1;
11            j=j-1;
12        }
13    }
14}
15
16// TC=O(n)
17// SC=O(1);