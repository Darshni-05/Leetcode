class Solution {
    public int mostWordsFound(String[] sentences) {
    
        // int maxCount = 0;
        // for(String word: sentences){
        //         int count = 1;
        //     for(int i=0;i<word.length();i++){
        //         if(word.charAt(i)==' ')
        //         count++;
        //     }
        //     if(count>maxCount)
        //     maxCount = count;
        // }
        // return maxCount;


         int max = 0;
        for (String str : sentences) {
            int length = str.split(" ").length;
            if (length > max) {
                max = length;
            }
        }
        return max;


    }
}