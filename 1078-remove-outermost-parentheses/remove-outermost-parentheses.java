class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        Set<Integer> removeIndices = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                int openIdx = stack.pop();
                if (stack.isEmpty()) {
                    removeIndices.add(openIdx);
                    removeIndices.add(i);
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!removeIndices.contains(i)) {
                res.append(s.charAt(i));
            }
        }
        
        return res.toString();
    }
}
