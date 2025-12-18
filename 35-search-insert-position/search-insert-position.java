class Solution {
    public int searchInsert(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        // If target is greater than all elements
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        // If target is smaller than or equal to first element
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

        // low is the correct insertion position
        return low;
    }
}