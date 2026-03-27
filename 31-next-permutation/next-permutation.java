class Solution {
    public void revarr(int [] nums, int ind){
        int start = ind;
        int end = nums.length - 1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
          int n = nums.length;
          int right1 = n-2, right2 = n-1;
             while(right1>= 0 && nums[right1] >= nums[right1+1]) right1--;
             if(right1 < 0){
                revarr(nums,0);
                return;
             }
             while(right2 >= 0 && nums[right2] <= nums[right1]) right2--;
             int temp = nums[right1];
             nums[right1] = nums[right2];
             nums[right2] = temp;
             revarr(nums,right1+1);
          }
}