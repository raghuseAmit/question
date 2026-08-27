class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        int i=0;
        while(i< nums.length){
            if(nums[i]==1){
                count++;
            }
            else{
                maxcount=Math.max(maxcount,count);
                count=0;
            }
            i++;
        }
        return Math.max(maxcount,count);
    }
}