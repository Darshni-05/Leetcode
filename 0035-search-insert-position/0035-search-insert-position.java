class Solution {
    public int searchInsert(int[] nums, int target) {
      //  for(int i= 0;i<nums.length-1;i++){
      //      int j = i+1;
      //      if(nums[i]>target && i==0)
      //      return 0;
      //      if(nums[i]==target)
      //      return i;
      //      if(nums[i]<target&&nums[j]>target)
      //      return j;
      //  } 
      //  if(nums.length==1 && target<=nums[0])
      //  return 0;
      //  return nums.length;
      int s = 0;
      int e = nums.length-1;
      while(s<=e){
        int mid = s+(e-s)/2;
        if(nums[mid]==target)
        return mid;
        if(nums[mid]<target)
        s = mid+1;
        else e = mid-1;
      }
      return e+1;
    }
}