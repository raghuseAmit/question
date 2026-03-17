class Solution {
    public int findKthLargest(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int[] freq = new int[max - min + 1];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i] - min]++;
        }
        for (int i = freq.length - 1; i >= 0; i--) {
            k -= freq[i];
            if (k <= 0) {
                return i + min;
            }
        }

        return -1;
    }
}