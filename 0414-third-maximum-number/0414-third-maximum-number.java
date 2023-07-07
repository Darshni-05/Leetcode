class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        Arrays.sort(nums);
        max1 = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]!=max1){
            max2=nums[i];
            break;
            }
        }
        for(int i = nums.length-3;i>=0;i--){
            if(nums[i]!=max2){
            max3=nums[i];
            break;
            }
        }
        return max3 == Long.MIN_VALUE?(int) max1 : (int)max3;
    }
}