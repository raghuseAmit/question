/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    if (!nums || nums.length === 0) {
        return 0;
    }
    let max_so_far = nums[0];
    let max_ending_here = nums[0];

    for (let i = 1; i < nums.length; i++) {
        max_ending_here = Math.max(nums[i], max_ending_here + nums[i]);
        max_so_far = Math.max(max_so_far, max_ending_here);
    }

    return max_so_far;
};