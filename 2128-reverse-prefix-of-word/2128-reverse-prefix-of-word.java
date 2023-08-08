class Solution {
    public static void reverse(char[] arr, int x ){
        int j = x;
        for(int i = 0;i<j;i++){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
    public static String reversePrefix(String word, char ch) {
       char[] arr = word.toCharArray();
       reverse(arr, word.indexOf(ch));
       return String.valueOf(arr); 
    }
}

//   int j = x;
//     for (int i = 0; i < j; i++) {
//         char temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//         j--;
//     }
// }

// public static String reversePrefix(String word, char ch) {
//     char[] arr = word.toCharArray();
//     reverse(arr, word.indexOf(ch));
//     return String.valueOf(arr);