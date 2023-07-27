class Solution {
    public boolean checkPerfectNumber(int num) {
        int count = 0;
        for(int i = 1;i<num;i++){
            if(num%i==0)
            count+=i;
        }
        if(num%2!=0)
        return false;
        if(count==num)
        return true;
        return false;
    }
}