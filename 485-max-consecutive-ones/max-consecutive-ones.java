class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0,right=0;
        int ans=0;
        
        while (right<nums.length) {
            if (nums[right]==0) {
                ans=Math.max(ans,right-left);
                while (right < nums.length && nums[right] == 0) {
                    right++;
                }
                left=right;
            } else {
                right++;
            }
        }
        return Math.max(ans,right-left);
    }
}