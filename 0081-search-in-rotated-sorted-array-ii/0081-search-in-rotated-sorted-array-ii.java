class Solution {
    public boolean search(int[] nums, int target) {
    //     String st = Arrays.toString(nums);
    //     System.out.println(st);
    //    if (st.contains(Integer.toString(target)))

    //     return true;
    //     return false;
    for(int i = 0;i<nums.length;i++){
        if(target == nums[i])
        return true;
    }
    return false;
    }
}