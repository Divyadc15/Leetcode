class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int i=0,j=0;
        int n=arr.length;
        long msum=0,csum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(j<n){
            csum+=arr[j];
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(j-i+1==k){
                if(map.size()==k) 
                msum=Math.max(msum,csum);
                csum-=arr[i];
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0) map.remove(arr[i]);
                i++;
            }
            j++;

        }
        return msum;
    }
}