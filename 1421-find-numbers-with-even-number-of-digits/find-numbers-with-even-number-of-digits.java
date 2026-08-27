class Solution {

    public int findNumbers(int[] nums) {

        int count = 0;
        for (int i=0;i<nums.length;i++) {
            int len =String.valueOf(nums[i]).length();// converting the integer into string and 
            if (len % 2 == 0)
                count++;
        }
        return count;
    }
}