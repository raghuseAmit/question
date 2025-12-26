class Solution {
    public String countAndSay(int n) {

        String curr = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder next = new StringBuilder();

            int j = 0;
            while (j < curr.length()) {
                char ch = curr.charAt(j);
                int count = 0;

                while (j < curr.length() && curr.charAt(j) == ch) {
                    count++;
                    j++;
                }

                next.append(count);
                next.append(ch);
            }

            curr = next.toString();
        }

        return curr;
    }
}
