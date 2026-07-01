1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int row=0;
6        int col=n-1;
7        while(row<m && col>=0){
8            if(matrix[row][col]==target){
9                return true;
10            }
11            else if(matrix[row][col]>target){
12                    col--;
13            }
14            else{
15                    row++;
16            }
17        }
18        return false;
19
20    }
21}