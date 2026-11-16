class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] chars = s.toCharArray();
        boolean isPalindrome = true;

        while(left <= right){
            if(!Character.isLetterOrDigit(Character.toLowerCase(chars[left]))){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(Character.toLowerCase(chars[right]))){
                right--;
                continue;
            }

            if(Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right]) ){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        return isPalindrome;
    }
}
