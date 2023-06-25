class Solution {
    public int maximumPopulation(int[][] logs) {
       int count = 0;
        TreeMap<Integer, Integer> arr = new TreeMap<>();
        for(int i = 0;i<logs.length;i++) {
            count = -1;
            for (int j = 0 ; j < logs.length; j++) {

//                if (logs[i][0] < logs[j][1] && logs[i][0] > logs[i-1][0]) {
//                    count++;
//                    arr.put(logs[i][0], count);
//                }
                if(logs[i][0]>=logs[j][0]&& logs[i][0]<logs[j][1]){
                    count++;
                    arr.put(logs[i][0],count);
                }
            }
        }
        if(arr.isEmpty())
            return logs[0][0];
        else
        {
            int key = 0;
            int val = Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer> entry: arr.entrySet()){
                int value = entry.getValue();
                if(value > val){
                    val=value;
                    key=entry.getKey();
                }
            }
            return key;
            }
    }
}