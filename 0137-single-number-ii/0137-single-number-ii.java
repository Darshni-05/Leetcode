class Solution {
    public int singleNumber(int[] nums) {
           //int ans=0;
           Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1])
            return nums[i];
            else i+=2;
        }
    
        return nums[nums.length-1];
    }
}