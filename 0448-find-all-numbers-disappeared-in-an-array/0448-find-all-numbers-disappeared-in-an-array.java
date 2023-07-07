class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         Set<Integer> arr = new HashSet<>();
        for (int val : nums) {
            arr.add(val);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 1;i<=nums.length;i++){
            if(!arr.contains(i))
            ans.add(i);
        }
        return ans;
    }
}