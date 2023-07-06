class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            al.add(nums[i]);
        }
        int n = nums.length;
        int count = 0;
 
        for(int i=0;i<=n;i++){
            if(!al.contains(i)){
                count = i;
                break; 
            }
        }
        return count;
    }
}