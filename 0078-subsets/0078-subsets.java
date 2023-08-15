class Solution {
    public void solve(int[] nums, List<Integer> out, int index , List<List<Integer>> ans)
    {
        if(index >= nums.length){
            ans.add(new ArrayList<>(out));
            return;
        }

        solve(nums, out, index+1,ans);

        int ele = nums[index];
        out.add(ele);
        solve(nums, out, index+1, ans);

        out.remove(out.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // ans.add(new ArrayList<>());
        List<Integer> out = new ArrayList<>();
        int index = 0;
        solve(nums, out, index, ans);
        return ans;
    }
}