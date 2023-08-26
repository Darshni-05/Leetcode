class Solution {
    int removeDuplicates(int nums[], int n)
    {
        if (n == 0 || n == 1)
            return n;
      
        // To store index of next unique element
        int j = 0;
      
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++)
            if (nums[i] != nums[i+1])
                nums[j++] = nums[i];
      
        nums[j++] = nums[n-1];
      
        return j;
    }
    public int firstMissingPositive(int[] nums) {
        // int max = 0;
        // List<Integer> arr = new ArrayList<>(nums.length);
        // for(int i = 0;i<nums.length;i++){
        //     if(max<nums[i])
        //     max=nums[i];
        //     arr.add(nums[i]);
        // }

        // for(int i = 1;i<=max;i++){
        //     if(!arr.contains(i))
        //     return i;
        // }
        // return max+1;
        if(nums.length==1 && (nums[0]!=1 || nums[0]<0))
        return 1;
        else if(nums.length==1 && nums[0]>0){
            return nums[0]+1;
        }
        
         int k = 0;
      
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
         
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++)
            if (nums[i] != nums[i+1])
                nums[k++] = nums[i];
      
        nums[k++] = nums[nums.length-1];
        
       
        // for(int i = 0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        // }
        int index = 0;
        int j = 1;
        if(nums[0]<0){
            for(int i = 0;i<nums.length;i++){
                if(!(nums[i]<=0))
                {
                    // if(nums[i]!=0)
                    // return 0;
                    // else
                    index = i;
                    break;
                }
            }
            for(int i = index;i<nums.length;i++){
                if(nums[i]!=j){
                    return j;
                }
                else j++;
            }
            return j;
        }
        else{
            if(nums[0]!=1 && nums[1]!=1)
            return 1;
            if(nums[1]==1){
                for(int i = 1;i<nums.length;i++){
                if(nums[i]!=j)
                    return j;
                else j++;
            }
            return j;
            }
            for(int i = 0;i<nums.length;i++){
                if(nums[i]!=j)
                return j;
                else j++;
            }
            return j;
        }
    }
}