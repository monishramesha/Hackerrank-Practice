class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for(String token : tokens){
            if(isNumeric(token)){
                stack.push(Integer.parseInt(token));
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                int result;
                switch (token){
                    case "*" :
                        result = val1 * val2;
                        break;
                    case "+" :
                        result = val1 + val2;
                        break;
                    case "-" :
                        result = val1 - val2;
                        break;
                    case "/":
                        result = val1 / val2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
    private boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
