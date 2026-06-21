
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            freq.put(curr, freq.getOrDefault(curr, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char curr = t.charAt(i);
            if (!freq.containsKey(curr)) {
                return false;
            }
            freq.put(curr, freq.get(curr) - 1);
            if (freq.get(curr) == 0) {
                freq.remove(curr);
            }
        }
        return freq.isEmpty();


    }
}
