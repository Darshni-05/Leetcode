class Solution {
    public int oddCells(int m, int n, int[][] indices) {


        // int[] row = new int[m];
        // int[] col = new int[n];
        // for(int i=0;i<m;i++){
        //     row[indices[]]
        // }
        //int count = 0;
        int[][] arr = new int[m][n];
        int r;
        int c;
        for(int i=0;i<indices.length;i++){
            r = indices[i][0];
            c = indices[i][1];
        for(int  j =0;j<n;j++)
            arr[r][j]++;
        
         for(int  j =0;j<m;j++)
            arr[j][c]++;
        }

         int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
     return count;
        // int[][] arr = new int[m][n];
        // int k=0;
        // int l=0;
        // for(int i=0;i<indices.length;i++)
        // {   //int k=indices[i][j];
        //     for(int j=0;j<indices[0].length;j++){
        //         //  arr[i][indices[i][j]]+=1;
        //         //  arr[i][indices[j][i]]+=1;
        //         // System.out.println(indices[j][i]);
        //          k=indices[i][j];
        //          l=indices[j][i];
        //     }
        //     arr[k][i]+=1;
        //     arr[i][l]+=1;
        //     System.out.println("k:"+k+"l:"+l);
        // }
        // for(int i =0;i<m;i++){
        // for(int j=0;j<n;j++)
        // System.out.print(arr[i][j]);
        // System.out.println();
        // }
        // return 0;
    }
}