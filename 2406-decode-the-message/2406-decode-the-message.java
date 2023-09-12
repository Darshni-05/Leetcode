class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> mapin = new HashMap<>();
        char a = 'a';
        for(char c: key.toCharArray()){
            if(!(mapin.containsKey(c)) && c!=' ')
            mapin.put(c,a++);
        }
        String ans = "";
        for(char c : message.toCharArray()){
            if(c!=' ')
            ans+= Character.toString(mapin.get(c));
            else
            ans +=" ";
        }
        return ans;
    }
}