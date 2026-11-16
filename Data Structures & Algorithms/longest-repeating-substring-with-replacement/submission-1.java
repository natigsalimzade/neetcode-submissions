class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(right < s.length()){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

            int max = 0;

            for(Character c : map.keySet()) {
                if(map.get(c) > max){
                    max = map.get(c);
                }
            }

            while(right - left + 1 - max > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}
