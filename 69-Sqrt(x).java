class Solution {
    public int mySqrt(int x) {
        int l=0,h=x;
        int ans=x;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(subprob(mid,x)==true){
                ans=mid;
                l=mid+1;
            }
            else h=mid-1;
        }
        return ans;
    }
    boolean subprob( long mid,int x){
        if(mid*mid<=x) return true;
        return false;
    }
}