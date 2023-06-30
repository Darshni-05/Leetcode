class Solution {
    public int arrangeCoins(int n) {
        int count = 0, temp=n;
        for(int i = 1;i<=n;i++){
            temp = temp-i;
            if(temp>=0)
            count++;
            else break;
        }
        return count;
    }
}