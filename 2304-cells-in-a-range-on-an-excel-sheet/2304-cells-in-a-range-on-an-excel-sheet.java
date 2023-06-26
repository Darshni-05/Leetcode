class Solution {
    public List<String> cellsInRange(String s) {
        List<String> sq = new ArrayList<>();
        for(char i = s.charAt(0);i<=s.charAt(3);i++){
            for(int j = Character.getNumericValue(s.charAt(1)); j<=Character.getNumericValue(s.charAt(4)); j++){
                String str = ""+j;
                sq.add(i+str);
            }
        }
        return sq;
    }
}