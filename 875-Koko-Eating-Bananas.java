class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        int ans=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(canFinish(piles,h,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    boolean canFinish(int[] piles,int h, int mid){
        long  hours=0,n=piles.length;
        for(int i=0;i<n;i++){
            hours+=(piles[i]+mid-1)/mid;
        }
        if(hours<=h) return true;
        return false;
    }
}