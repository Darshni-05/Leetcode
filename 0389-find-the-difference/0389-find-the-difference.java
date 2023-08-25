class Solution {
    public char findTheDifference(String s, String t) {
    //     int sum = 0;
    //     for (char c : t.toCharArray())
    // {
    //     sum += c;
    // }

    // for (char c : s.toCharArray())
    // {
    //     sum -= c;
    // }

    // return (char)sum;
    int x = 0;
    for(int i = 0;i<s.length();i++){
        x^=s.charAt(i);
    }
    for(int i = 0;i<t.length();i++){
        x^=t.charAt(i);
    }
    return (char)x;
    }
}