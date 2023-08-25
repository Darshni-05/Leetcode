class Solution {
    public int arraySign(int[] nums) {
        //int c1= 0; 
        int c2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0)
            return 0;
            // if(nums[i]>0)
            // c1++;
            
            if(nums[i]<0)c2++;
        }
        if(c2%2==0)
        return 1;
        else return -1;
    }
}