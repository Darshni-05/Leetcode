class Solution {
    public String interpret(String command) {
        String result="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G')
            result+='G';
            else if(command.charAt(i)=='('){
                //i++;
                continue;
            }
            else if(command.charAt(i)==')'){
                result+='o';
            }
            else if(command.charAt(i)=='a'){
                 result+='a';
                 result+='l';
                 i+=2;
            }
           
        }
        return result;
    }
}