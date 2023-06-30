class Solution {
    public int[] plusOne(int[] digits) {
    //    int n = digits.length-1;
    //    if(n>0){
    //        if(digits[n]==9){
    //        digits[n]=0;
    //        while(n>=0 && digits[n--]==9)
    //        digits[n]=0;
    //        digits[n]+=1;
    //        }
    //        digits[n]+=1;
    //        return digits;
    //    } 
    //    else if(digits[n]!=9){
    //        digits[n]+=1;
    //        return digits;
    //    }
    //    else{
    //        int[] num = new int[2];
    //        num[0]=1;
    //        num[1]=0;
    //        System.out.println(num);
    //        return num;
    //    }
    // int res=0;
    // for(int i=0;i<digits.length;i++) {
    //      res=res*10+digits[i];
    // }
    // res=res+1;
    // // int arr = new int
    // // while(res!=0){

    // // }
    // int[] ans = Integer.toString(res).chars().map(c -> c-'0').toArray();
    // return ans
    
    


  for(int i = digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int [digits.length+1];
        digits[0] = 1;
        return digits;





























//       List<Integer> arr = new ArrayList<>();
//         int k = 1;
//         for(int i =digits.length-1;i>=0;i--){
//             arr.add(0, (digits[i]+k)%10);
//             k=(digits[i]+k)/10;
//         }

//         while(k!=0){
//             arr.add(0,k%10);
//             k/=10;
//         }


// return  arr.stream().mapToInt(Integer::intValue).toArray();

    }
}