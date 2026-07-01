1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int[] res=new int[nums.length];
4        int i=0;
5        int j=nums.length-1;
6        int k=nums.length-1;
7        while(i<=j){
8            if(Math.abs(nums[i])>Math.abs(nums[j])){
9                res[k]=nums[i]*nums[i];
10                i=i+1;
11            }
12            else{
13                res[k]=nums[j]*nums[j];
14                j=j-1;
15            }
16            k=k-1;
17        }
18        return res;
19    }
20}