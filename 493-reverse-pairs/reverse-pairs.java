class Solution {
    private int mergeAndCount(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int leftPtr = start;
        int rightPtr = mid + 1;
        int tIndex = 0;
        int pairs = 0;

        while (leftPtr <= mid && rightPtr <= end) {
            if (nums[leftPtr] <= nums[rightPtr]) {
                temp[tIndex++] = nums[leftPtr++];
            } else {
                temp[tIndex++] = nums[rightPtr++];
            }
        }

        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if ((long) nums[i] > 2L * (long) nums[j]) {
                pairs += (mid - i + 1);
                j++;
            } else {
                i++;
            }
        }

        while (leftPtr <= mid) {
            temp[tIndex++] = nums[leftPtr++];
        }
        while (rightPtr <= end) {
            temp[tIndex++] = nums[rightPtr++];
        }

        for (int src = 0, dst = start; dst <= end; src++, dst++) {
            nums[dst] = temp[src];
        }

        return pairs;
    }

    private int sortAndCount(int[] nums, int start, int end) {
        if (start >= end) return 0;  // CHANGED: >= instead of ==
        
        int mid = (start + end) / 2;
        int leftCount = sortAndCount(nums, start, mid);
        int rightCount = sortAndCount(nums, mid + 1, end);
        int crossCount = mergeAndCount(nums, start, mid, end);

        return leftCount + rightCount + crossCount;
    }

    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return sortAndCount(nums, 0, nums.length - 1);
    }
}
