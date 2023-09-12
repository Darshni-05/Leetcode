class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int r = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='R')
            r++;
            else if(s.charAt(i)=='L')
            r--;
            if(r==0)
            count++;
        }
        return count;
    }
}