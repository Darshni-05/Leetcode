class Solution {
    public int[] sumZero(int n) {
       int d = n/2;
        int[] ar = new int[n];
        if(n%2 == 0){
        for(int i=0;i<n;i++){
                ar[i]=-d;
                ar[++i]=d;
                d=d+1;
        }
    }
    else{
        for(int i=0;i<n-1;i++){
                ar[i]=-d;
                ar[++i]=d;
                d=d+1;
        }
        ar[n-1]=0;
    }
    return ar;
}
}