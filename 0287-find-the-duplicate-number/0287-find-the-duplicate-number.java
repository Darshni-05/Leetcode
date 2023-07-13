class Solution {
    public int findDuplicate(int[] nums) {
        // for(int i = 0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j])
        //         return nums[i];
        //     }
        // }
        // return nums[nums.length-1];
        // int sum1 = 0;
        // int sum2 = 0;
        // for(int i = 1;i<=nums.length-1;i++)
        // sum1+=i;
        // for(int i = 0;i<nums.length;i++)
        // sum2+=nums[i];
        // return sum2-sum1==0?nums[0]:sum2-sum1;
       HashSet<Integer> states = new HashSet<Integer>();

        for (int num : nums) {
            if (states.contains(num)) {
                return num;
            }
            else {
                states.add(num);
            }
        }

        return 0;
    }
}