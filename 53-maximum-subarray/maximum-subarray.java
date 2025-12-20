class Solution {
    static int maxsum;

    public int maxSubArray(int[] arr) {
        maxsum = arr[0];

        int currsum = 0;

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            currsum = currsum + arr[i];

            maxsum = Math.max(maxsum, currsum);

            if (currsum < 0) {
                currsum = 0;
            }
        }
        return maxsum;

    }
}