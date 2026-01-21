class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }

    private void permute(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int n : nums) temp.add(n);
            result.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {

            // brute-force duplicate check
            if (isDuplicate(nums, index, i)) continue;

            swap(nums, index, i);
            permute(nums, index + 1, result);
            swap(nums, index, i); // backtrack
        }
    }

    private boolean isDuplicate(int[] nums, int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (nums[i] == nums[curr]) return true;
        }
        return false;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
