class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c = nums1.length+nums2.length;
        double med = 0.0;
        int[] ans = new int[c];
        System.arraycopy(nums1,0,ans,0,nums1.length);
        System.arraycopy(nums2,0,ans,nums1.length,nums2.length);
        Arrays.sort(ans);
        for(int  i= 0;i<c;i++)
        System.out.print(ans[i]+" ");
        if(c%2==0){
        med = (double)(ans[(c-1)/2]+ans[((c-1)/2+1)])/2;
        }
        else {
        med = ans[(c)/2];
        }
          return med;
    }
  
}