class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
            st.append(s.charAt(i));
        }
          return st.toString().equals(st.reverse().toString());
    }
}