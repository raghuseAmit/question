class Solution {
    public void sortColors(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=nums[index];
                nums[index++]=0;
            }
        }
        for(int i=index;i<nums.length;i++){
            if(nums[i]==1){
                nums[i]=nums[index];
                nums[index++]=1;
            }
        }
    }
}