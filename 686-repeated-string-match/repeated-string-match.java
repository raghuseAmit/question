class Solution {
    public int repeatedStringMatch(String a, String b) {
        String temp = a;
        int repeat = 1;

        while (temp.length() < b.length()) {
            temp = temp + a;
            repeat++;
        }

        if (check(temp, b)) return repeat;

        temp = temp + a;
        if (check(temp, b)) return repeat + 1;

        return -1;
    }

    public boolean check(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                return true;
            }
        }

        return false;
    }
}