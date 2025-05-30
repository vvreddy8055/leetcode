class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = binarySearch(nums,target,false);
        int last = binarySearch(nums,target,true);

        return new int[]{last,first};
    }

    public static int binarySearch(int[] nums,int target,boolean isalreadyExist){
        int low = 0,high=nums.length-1,mid;
        int pos = -1;
        while(low<=high){
            mid = low+ (high-low)/2;
            if(nums[mid]==target){
                pos = mid;                
                if(isalreadyExist){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return pos;
    }
}