class Solution {
    public int calPoints(String[] operations) {
    //ArrayList<Integer> arr = new ArrayList<>();
    Stack<Integer> arr = new Stack<>();
    for(int i = 0;i<operations.length;i++){
        if(Character.isDigit(operations[i].charAt(0))){
       arr.push(Integer.parseInt(operations[i]));
        }
        else if(operations[i].length()!=1){
            // int x = operations[i].charAt(1)-'0';
            // arr.push(x*-1);
            arr.push(Integer.parseInt(operations[i]));
        }
        else if(operations[i].charAt(0)=='D'){
        arr.push(2*arr.peek());
        }
        else if(operations[i].charAt(0)=='C') arr.pop();
        else if(operations[i].charAt(0)=='+'){
            int sum = arr.peek();
            int x = arr.pop();
            sum+=arr.peek();
            arr.push(x);
            arr.push(sum);
        }
    } 
    int sum = 0;   
    while(!arr.isEmpty()){
        sum += arr.pop();
    }
    return sum;
    }
}