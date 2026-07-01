1class Solution {
2    public boolean isPalindrome(String s) {
3        int i=0, j=s.length()-1;
4        while(i<j){
5            char l=s.charAt(i);
6            char r=s.charAt(j);
7            if(!Character.isLetterOrDigit(l)){
8                i=i+1;
9                continue;
10            }
11            if(!Character.isLetterOrDigit(r)){
12                j=j-1;
13                continue;
14            }
15             if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
16                return false;
17            }
18           i=i+1;
19           j=j-1;
20           
21        }
22        return true;
23    }
24}