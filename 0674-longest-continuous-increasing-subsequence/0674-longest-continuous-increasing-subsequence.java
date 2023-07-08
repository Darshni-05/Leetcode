class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count1 = 1;
        int count2 = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
            count1++;
            else{
                if(count1>count2)
                count2 = count1;
                count1 = 1;
            }
            
        }
        return Math.max(count1,count2);
    }
}