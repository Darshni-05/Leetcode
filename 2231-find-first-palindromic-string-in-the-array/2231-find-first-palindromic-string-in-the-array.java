class Solution {
    public boolean isPalindrome(String s){
        String str = "";
        char ch;
        for (int i=0; i<s.length(); i++)
      {
        ch= s.charAt(i); 
        str= ch+str; 
      }
      if(s.equals(str))
      return true;
      return false;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0;i<words.length;i++){
            if(isPalindrome(words[i]))
            return words[i]; 
        }
        return "";
    }
}