class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] neg = new int[n/2];
        int[] pos = new int[n/2];
        int k=0,l=0;
        for(int i = 0;i<n;i++){
            if(nums[i]>0)
            pos[k++]=nums[i];
            else
            neg[l++]=nums[i];
        }
        l = 0;
        int[] ans  = new int[n];
         for(int i = 0;i<n;i++){
             ans[i]=pos[l];
             ans[++i]=neg[l];
             l++;
         }




    //     int low = 0;
    //     int high = nums.length-1;
    //     int[] ans = new int[nums.length];
    //     while(low<=high){
    //         if(nums[low]>0)
    //         low++;
    //         else if(nums[low]<0&&nums[high]>0)
    //         {
    //             int temp = nums[low];
    //             nums[low] = nums[high];
    //             nums[high] = temp;
    //             high--;
    //             low++;
    //         }
    //         else
    //         high--;
               
    //     }
    //      for(int i = 0;i<nums.length;i++){
    //     System.out.print(nums[i]);}
    // for(int i = 0;i<nums.length/2;i++){
    //     ans[i] = nums[i];
    //     ans[i+1]=nums[i+(nums.length/2)];
    // }
    return ans;
    }
}