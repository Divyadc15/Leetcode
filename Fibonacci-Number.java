1class Solution 
2{
3    public int fib(int n)
4    {
5        return solve(n);
6    }
7    public int solve(int n)
8    {
9        if(n==0) return 0;
10        if(n==1) return 1;
11        return solve(n-1)+solve(n-2);
12    }
13}