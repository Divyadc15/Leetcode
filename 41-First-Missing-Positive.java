class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int start = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }

            if (nums[i] == start) {
                start++;
            } else if (nums[i] > start) {
                return start;
            }
            // if nums[i] < start, it's a duplicate or smaller positive, so ignore it
        }

        return start;
    }
}