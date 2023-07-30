class Solution {
    public int vowel(String s){
        String v = "aeiouAEIOU";
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(v.indexOf(s.charAt(i))!=-1)
            count++;
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = "";
        String b = "";
        int i = 0;
        while(i<n/2){
            a = a+s.charAt(i);
            i++;
        }
        while(i<n){
            b = b+s.charAt(i);
            i++;
        }
    if(vowel(a)==vowel(b))
    return true;
    return false;
    }
}