class Solution {
    public String sortSentence(String s) {
     String[] ans = s.split(" ");
     String[] ab = new String[ans.length];
     for(int i = 0;i<ans.length;i++){
         int j = ans[i].charAt(ans[i].length()-1)-'0';
        ab[j-1] = ans[i].substring(0,ans[i].length()-1);
     }
     return String.join(" ",ab);
    }
}