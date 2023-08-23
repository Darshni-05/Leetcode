
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]indice=new int[2];
        int temp;
        for(int i=0;i<nums.length;i++){
            temp=target-nums[i];
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]==temp){
                indice[0]=j;
                indice[1]=i;
                break;
            }
        
        }
        
        }
    return indice;
    }

}
