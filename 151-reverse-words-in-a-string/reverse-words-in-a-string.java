public class Solution {
    public String reverseWords(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        
        if (start > end) return "";
        char[] arr = s.toCharArray();
        java.util.List<String> words = new java.util.ArrayList<>();
        
        int i = start;
        while (i <= end) {
            if (arr[i] != ' ') {
                int wordStart = i;
                while (i <= end && arr[i] != ' ') i++;
               StringBuilder word = new StringBuilder();
                for (int j = wordStart; j < i; j++) {  
                    word.append(arr[j]);
                }
                words.add(word.toString());
            } else {
                i++;
            }
        }
        java.util.List<String> reversed = new java.util.ArrayList<>();
        for (int j = words.size() - 1; j >= 0; j--) {
            reversed.add(words.get(j));
        }
        
        // Manual join with spaces
        StringBuilder result = new StringBuilder();
        for (int k = 0; k < reversed.size(); k++) {
            result.append(reversed.get(k));
            if (k < reversed.size() - 1) {
                result.append(' ');
            }
        }
        
        return result.toString();
    }
}
