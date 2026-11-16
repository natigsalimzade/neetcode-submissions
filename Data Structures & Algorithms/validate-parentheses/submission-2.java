class Solution {
    public boolean isValid(String s) {
        boolean isValid = false;

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(stack.isEmpty()
            || ch == '('
            || ch == '['
            || ch == '{'){
                stack.push(ch);
            }else if(ch == ')' && stack.peek() == '('){
                stack.pop();
            } else if(ch == ']' && stack.peek() == '['){
                stack.pop();
            } else if(ch == '}' && stack.peek() == '{'){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        if(stack.isEmpty()){
            isValid = true;
        }

        return isValid;
    }
}
