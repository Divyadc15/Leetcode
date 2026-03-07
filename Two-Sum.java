1import java.util.HashMap;
2
3class Solution {
4    public int[] twoSum(int[] nums, int target) {
5        HashMap<Integer, Integer> mp = new HashMap<>();
6        
7        for (int i = 0; i < nums.length; i++) {
8            int complement = target - nums[i];
9            if (mp.containsKey(complement)) {
10                return new int[]{mp.get(complement), i};
11            }
12            mp.put(nums[i], i);
13        }
14        
15        return new int[]{}; 
16    }
17}