class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr = new ArrayList<>();

        for(int i =num.length-1;i>=0;i--){
            arr.add(0, (num[i]+k)%10);
            k=(num[i]+k)/10;
        }

        while(k!=0){
            arr.add(0,k%10);
            k/=10;
        }



return arr;







        // for(int i=num.length-1;i>=0;i--){
        //    // System.out.println(num[i]+"  "+k%10);
        //     arr.add(0,num[i]+(k%10));
        //     k=k/10;
        // }
        // if(k>0){
        //     while (k!=0){
        //         arr.add(0,k%10);
        //         k/=10;
        //     }
        // }

        // for(int i = arr.size()-1;i>=0;i--){
        //     if(arr.get(i)>9&&i!=0)
        //     {
        //         int m = arr.get(i);
        //         arr.set(i, m%10);
        //         arr.set(i-1, arr.get(i-1)+m/10);
        //     }
        //     else if(arr.get(i)>9&&i==0)
        //     {
        //         int m = arr.get(i);
        //         arr.set(i, m%10);
        //         arr.add(0, m/10);
        //     }
        // }
        //     return arr;

















    //     for(int i = num.length-1; i>=0;i--){
    //         // if(num[i]==0){
    //         //     arr.add(i, k%10);
    //         // }
    //         // else
    //             arr.add(0,num[i]+k%10);
    //             k/=10;
    //             if(arr.get(0)>9){
    //                 int temp = arr.get(0);
    //                 k+=1;
    //                 arr.set(0, temp-10);
    //                 // arr.add(0,10);
    //             }
    //     }
    //     if(arr.get(0)>9){
    //         int temp = arr.get(0);
    //         arr.add(0, temp%10);
    //         arr.set(1,temp/10);
    //     }
    //     //Collections.reverse(arr);
    //     return arr;

    // //    long arr = 0; //Integer.parseInt(Arrays.toString(num))+k;
    // //    signed int i=0;
    // //     while(i<num.length){
    // //         arr=arr*10+num[i++];
    // //     }
    // //     arr=arr+k;
    // //     System.out.println(arr);
    // //    while(arr!=0)
    // //    {
    // //        ar.add(0,arr%10 );
    // //        arr/=10;
    // //    }
    // //    return ar;

    }
}