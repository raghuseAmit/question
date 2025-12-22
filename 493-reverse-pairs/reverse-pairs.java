class Solution {

    private int[] temp; 

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = 0;

        count += mergeSort(nums, left, mid);
        count += mergeSort(nums, mid + 1, right);

        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j - (mid + 1);
        }

        // merging 
        int i1 = left;
        int i2 = mid + 1;
        int k = left;

        while (i1 <= mid && i2 <= right) {
            if (nums[i1] <= nums[i2]) {
                temp[k++] = nums[i1++];
            } else {
                temp[k++] = nums[i2++];
            }
        }

        while (i1 <= mid) temp[k++] = nums[i1++];
        while (i2 <= right) temp[k++] = nums[i2++];

        for (int i = left; i <= right; i++) {
            nums[i] = temp[i];
        }

        return count;
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;
        temp = new int[n]; 
        return mergeSort(nums, 0, n - 1);
    }
}
