class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(String str : tokens){
            if(!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")){
                stack.push(Integer.parseInt(str));
            } else {
                if(str.equals("+")){
                    result = stack.pop() + stack.pop();
                }

                if(str.equals("-")){
                    int peek = stack.peek();
                    stack.pop();
                    result = stack.peek() - peek;
                    stack.pop();
                }

                if(str.equals("*")){
                    result = stack.pop() * stack.pop();
                }

                if(str.equals("/")){
                    int peek = stack.peek();
                    stack.pop();
                    result = stack.peek() / peek;
                    stack.pop();
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }
}
