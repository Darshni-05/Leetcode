class Solution {
    public int minCostToMoveChips(int[] position) {
        int count = 0;
        for(int i = 0;i<position.length;i++){
            if(position[i]%2 == 0)
            count++;
        }
        return Math.min(count, (position.length-count));
    }
}