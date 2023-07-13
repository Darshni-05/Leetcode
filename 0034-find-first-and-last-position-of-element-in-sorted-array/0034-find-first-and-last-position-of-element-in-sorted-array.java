class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int i = 0;
        for( i = 0;i<nums.length;i++){
            if(nums[i]==target){
            ans[0]=i;
            break;}
        }
        for(int j = nums.length-1;j>=i;j--){
            if(nums[j]==target){
            ans[1]=j;
            break;}
        }
        return ans;
    }
}