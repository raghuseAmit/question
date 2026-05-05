class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int out = 0, beg = 0, end = 0;
        int P = 1;
        while (end < nums.length) {
            P *= nums[end];
            while (end >= beg && P >= k) {
                P /= nums[beg];
                beg++;
            }
            out += end - beg + 1;
            end++;
        }
        return out;
    }
}