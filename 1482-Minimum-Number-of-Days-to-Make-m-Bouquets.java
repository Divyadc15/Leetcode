class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int l=1,h=Arrays.stream(bloomDay).max().getAsInt();
        int ans=-1;
        if(m*k>n) return -1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    boolean possible(int[] bloomDay,int mid,int m, int k){
        int bouq=0,curr=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid) curr++;
            else curr=0;
            if(curr==k){
                bouq++;
                curr=0;
            }
        }
        if(bouq>=m) return true;
        return false;
    }
}