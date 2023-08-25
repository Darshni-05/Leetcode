class Solution {
    public int countOdds(int low, int high) {
    //     double ans=(double)Math.ceil((high-low)/2);
    //     //double ams = (double)3/2;
    //     System.out.println(ans);
    //    // System.out.println((int)Math.ceil((ams)));
    //     if(low%2!=0)
    //     ans++;
    //     return (int)ans;
        if(low%2==0 && high%2==0)
            return (high-low)/2;
        else
            return (high-low)/2+1;
    }
}