class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum =  Integer. MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum>maxSum)
            maxSum = currSum;
            if(currSum<0)
            currSum = 0;
        } 
        return maxSum;










    //    int sum = 0;
    //    int max = 0;
    //    for(int i = 0;i<nums.length;i++){
    //        sum = nums[i];
    //        for(int j = i+1;j<nums.length;j++){
    //            sum += nums[j];
    //        }
    //    } 
    // // int i = 0;
    // // int j = nums.length-1;
    // // while(i<j){

    // // }
    }
}