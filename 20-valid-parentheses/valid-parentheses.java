class Solution {
    public boolean isValid(String s) {
       
        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            } else {
                if (top == -1 ||
                   (ch == ')' && stack[top] != '(') ||
                   (ch == '}' && stack[top] != '{') ||
                   (ch == ']' && stack[top] != '[')) {
                    return false;
                }
                top--;
            }
        }
        return top == -1;
    }
}
