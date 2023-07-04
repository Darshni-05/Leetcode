class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String[] st = new String[k];
        String str="";
        int i;
        for(i =0;i<k-1;i++){
            str+= arr[i];
            str+=" ";
        }
        str+=arr[i];
        return str;
        //Arrays.toString(st);
    }
}