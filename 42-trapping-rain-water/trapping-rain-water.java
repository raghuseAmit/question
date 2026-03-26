class Solution {
    public int trap(int[] bars) {
        int size = bars.length;
        int start = 0, end = size - 1;
        int maxLeft = 0, maxRight = 0;
        int totalWater = 0;
        while (start < end) {
            if (bars[start] <= bars[end]) {
                if (bars[start] >= maxLeft) {
                    maxLeft = bars[start];
                } else {
                    totalWater += maxLeft - bars[start];
                }
                start++;
            } else {
                if (bars[end] >= maxRight) {
                    maxRight = bars[end];
                } else {
                    totalWater += maxRight - bars[end];
                }
                end--;
            }
        }
        return totalWater;
    }
}