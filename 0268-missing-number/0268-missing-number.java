class Solution {
    public int missingNumber(int[] nums) {
        // List<Integer> al = new ArrayList<>();
        // for(int i = 0;i<nums.length;i++){
        //     al.add(nums[i]);
        // }
        // int n = nums.length;
        // int count = 0;
 
        // for(int i=0;i<=n;i++){
        //     if(!al.contains(i)){
        //         count = i;
        //         break; 
        //     }
        // }
        // return count;

        int n = nums.length;
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i = 0;i<nums.length;i++){
            sum2+=nums[i];
        }
        return sum1-sum2;
    }
}