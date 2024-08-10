class Solution {
    public int calculate(String s) {
        int number = 0;
        int signValue = 1;
        int result = 0;
        Stack<Integer> oprStack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                number = number * 10 + (c - '0');
            }else if (c == '+' || c == '-'){
                result += number * signValue;
                signValue = (c == '-') ? -1 : 1;
                number = 0;
            }else if (c == '('){
                oprStack.push(result);
                oprStack.push(signValue);
                result = 0;
                signValue = 1;
            }else if (c == ')'){
                result += signValue * number;
                result *= oprStack.pop();
                result += oprStack.pop();
                number = 0;
            }
        }

        return result + number * signValue;
    }
}
