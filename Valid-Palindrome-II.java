1class Solution {
2    public boolean validPalindrome(String s) {
3        int i=0,j=s.length()-1;
4        while(i<j){
5            char l=s.charAt(i);
6            char r=s.charAt(j);
7            if(l!=r){
8                return solve(i+1,j,s)|| solve(i,j-1,s);
9            }
10            else{
11                i=i+1;
12                j=j-1;
13            }
14           
15        }
16         return true;
17    }
18     public boolean solve(int i,int j,String s){
19        while(i<j){
20            if(s.charAt(i)!=s.charAt(j)){
21                return false;
22            }
23            i=i+1;
24            j=j-1;
25        }
26        return true;
27     }
28}
29
30//TC=O(n)
31//SC=O(1)