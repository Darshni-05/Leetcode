class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int low  = 0;
        // int high = numbers.length-1;
  
        // if(numbers[low]+numbers[high]==target){}
        // else
        // while(low<high){
        //           int mid  = (low+high)/2;

        // }
        int ans[] = new int [2];
        // for(int i = 0;i<nums.length-1;i++)
        // for(int j = i+1;j<nums.length;j++)
        // {
        //     if(nums[i]+nums[j]==target)
        //     {
        //         ans[0]=i+1;
        //         ans[1]=j+1;
        //     }
        // }
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            if(nums[low]+nums[high]>target)
            high -=1;
            else if(nums[low]+nums[high]<target)
            low+=1;
            else{
                ans[0]=low+1;
                ans[1]=high+1;
                return ans;
            }
        }
        return ans;
    }
}