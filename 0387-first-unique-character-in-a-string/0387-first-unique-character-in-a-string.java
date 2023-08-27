class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
        int flag = -1;
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                flag = 0;
                break;
                }
                else flag = 1;
            }
            if(flag == 1)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }
}