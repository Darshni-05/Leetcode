// class Solution {
//     public List<Integer> luckyNumbers (int[][] matrix) {
//         List<Integer>arr = new ArrayList<>();
//         for(int i = 0;i< matrix.length;i++){
//             int min = matrix[i][0];
//             for(int j = 0;j<matrix[i].length;j++){
//                 if(min>matrix[i][j]){
//                     min = matrix[i][j];
//                 }
//             }
//             arr.add(min);
//         }
//         System.out.println(arr);
// int k = 0;
//         for(int j = 0;j< matrix[1].length;j++){
//             int max = matrix[0][j];
//             for(int i = 0;i<matrix.length;i++){
//                 if(max<matrix[i][j]){
//                 //   if(arr.indexOf(max)!=-1)
//                 //   arr.remove(Integer.valueOf(max));
//                 max = matrix[i][j];
//                 }
//             }

//             if(arr.get(k)!=max)
//             arr.remove(k);
//             else k++;
//         }
//         return arr;
//     }
// }


class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNums = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
            luckyNums.add(min);
        }

        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < matrix[0].length; j++) {
            int max = matrix[0][j];
            for (int i = 0; i < matrix.length; i++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
            if (luckyNums.contains(max)) {
                result.add(max);
            }
        }
        
        return result;
    }
}