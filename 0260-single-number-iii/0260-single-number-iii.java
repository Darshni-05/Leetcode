class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans  = new int[2];
        Arrays.sort(nums);
        int j = 0;
        int count  = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
            ans[j]=nums[i];
            j++;
            count++;
            }
            else i++;
        }
        if(count==1)
        ans[1]=nums[nums.length-1];
        return ans;
    }
}