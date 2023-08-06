class Solution {
    public boolean judgeCircle(String moves) {
        int cu = 0, cd = 0, cr = 0, cl = 0;
        for(int i = 0;i<moves.length();i++){
            if(moves.charAt(i)=='U')
            cu++;
            else if(moves.charAt(i)=='L')
            cl++;
            else if(moves.charAt(i)=='R')
            cr++;
            else 
            cd++;
        }
        return (cd - cu == 0) && (cr - cl == 0);
    }
}