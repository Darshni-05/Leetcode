class Solution {
    public boolean isPalindrome(int x) {
        int temp=0;
        if(x<0)
        return false;
     for(int i=x;i!=0;i/=10){
         temp=temp*10+(i%10);
     } 
     if(x==temp)
      return true;
    else 
        return false;  
    }
}