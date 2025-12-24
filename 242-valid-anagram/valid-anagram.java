class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        String tCopy = t;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int found = tCopy.indexOf(ch);
            if (found == -1) return false;
            tCopy = tCopy.substring(0, found) + tCopy.substring(found + 1);
        }
        
        return tCopy.isEmpty();
    }
}
