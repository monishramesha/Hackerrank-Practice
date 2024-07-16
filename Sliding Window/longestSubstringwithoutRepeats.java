import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for(int right=0; right<n; right++){
            if(!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left){
                charMap.put(s.charAt(right), right);
                maxLen = Math.max(maxLen, right - left + 1);
            } else{
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }

        return maxLen;
    }
}
