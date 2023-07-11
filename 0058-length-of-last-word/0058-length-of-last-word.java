class Solution {
    public int lengthOfLastWord(String s) {
        String[] st = s.split(" ");
        int n = st.length-1;
        return st[n].length();
    }
}