class Solution {
    public boolean isAnagram(String s, String t) {

                if(s.length() != t.length()){
            return false;
        }

        if(s == t){
            return true;
        }
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            stack.push(ch);
        }

        for(char ch : t.toCharArray()){
            int lastIndex = stack.lastIndexOf(ch);
            if(lastIndex > -1){
                stack.remove(lastIndex);
            }
        }

        return stack.isEmpty();
    }
}
