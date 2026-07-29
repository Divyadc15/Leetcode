class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int f=first(nums,target);
        int l=last(nums,target);
         return new int[]{f, l};
        
    }
    int first(int[] nums, int target){
        int l=0,h=nums.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
            ans= mid;
            h=mid-1;
        }
        else if(nums[mid]>target){
            h=mid-1;
        }
        else{
            l=mid+1;
        }
        }
        return ans;

    }
    int last(int[] nums, int target){
        int l=0,h=nums.length-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                ans=mid;
                l=mid+1;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else 
            l=mid+1;
        }
        return ans;
    }
}