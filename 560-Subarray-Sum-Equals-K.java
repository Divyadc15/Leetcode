class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int[] pre=new int[n+1];
        pre[0]=0;
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + nums[i];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        map.put(0,1);
        for(int i=1;i<=n;i++){
            int pl=pre[i]-k;
             ans += map.getOrDefault(pl, 0);
            map.put(pre[i], map.getOrDefault(pre[i], 0) + 1);
        }
        return ans;
    }
}