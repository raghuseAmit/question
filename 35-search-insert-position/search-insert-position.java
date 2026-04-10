class Solution {
    public int searchInsert(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        if (target <= nums[0]) {
            return 0;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}