class Solution {
    public int countSegments(String s) {
        if(s.isEmpty())
        return 0;
        if(s.equals(" "))
        return 0;
       String[] arr = s.split(" ");
       int n = arr.length;
       for(int i = 0;i<arr.length;i++){
            if(arr[i].isEmpty())
                n--;
            else if(arr[i].equals(" "))
                n--;
       }
       System.out.println(Arrays.toString(arr));
       return n; 
    }
}