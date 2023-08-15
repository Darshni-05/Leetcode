class Solution {
    // public static void solve(List<String> ans, String str, StringBuilder output, int i) {
    //     // Base case
    //     if (i >= str.length()) {
    //         //if (output.length() > 0) {
    //             ans.add(output.toString());
    //         //}
    //         return;
    //     }

    //     // Exclude
    //     solve(ans, str, output, i + 1);
    //     // Include
    //     output.append(str.charAt(i));
    //     solve(ans, str, output, i + 1);
    //     output.deleteCharAt(output.length() - 1); // Backtrack
    // }

    // public static List<String> subsequences(String str) {
    //     List<String> ans = new ArrayList<>();
    //     StringBuilder output = new StringBuilder();
    //     solve(ans, str, output, 0);
    //     return ans;
    // }

  public boolean isSubsequence(String s, String t) {
        // List<String> ans= subsequences(t);
        // if(ans.contains(s))
        // return true;
        // return false;

int temp = 0;
        if ( temp == s.length() ){
            return true;
        }
        for (int i = 0; i < t.length(); i++){
            if ( s.charAt(temp) == t.charAt(i) ){
                temp++;
            }
            if ( temp == s.length() ){
                return true;
            }
        }
        return false;


    }
}