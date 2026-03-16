class Solution {
    public String largestNumber(int[] nums) {
        String ar[] = new String[nums.length];
        for(int i = 0;i<nums.length;i++){
            ar[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ar, (a,b) -> {
            String j = a + b;
            String i = b + a;
            return i.compareTo(j);
        });
        String str = "";
        boolean b = false;
        for(String i : ar){
            str+=i;
            if(!b && !i.equals("0"))b=true;
        }
        if(!b)return "0";
        return str;
    }
}