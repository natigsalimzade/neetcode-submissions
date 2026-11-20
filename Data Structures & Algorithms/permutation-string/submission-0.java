class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] need = new int[26], window = new int[26];
        int k = s1.length();
        for (int i = 0; i < k; i++) {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (need[i] == window[i]) matches++;
        }

        for (int right = k; right < s2.length(); right++) {
            if (matches == 26) return true;

            int in = s2.charAt(right) - 'a';
            window[in]++;
            if (window[in] == need[in]) matches++;
            else if (window[in] == need[in] + 1) matches--;

            int out = s2.charAt(right - k) - 'a';
            window[out]--;
            if (window[out] == need[out]) matches++;
            else if (window[out] == need[out] - 1) matches--;
        }
        return matches == 26;
    }
}
