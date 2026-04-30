class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            int length = 0;

            for (int j = i; j < s.length(); j++) {
                boolean found = false;

                for (int k = i; k < j; k++) {
                    if (s.charAt(k) == s.charAt(j)) {
                        found = true;
                        break;
                    }
                }

                if (found) break;

                length++;
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}