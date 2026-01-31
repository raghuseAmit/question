class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            int maxNum = 0;
            for (int num : freq.keySet()) {
                int f = freq.get(num);
                if (f > maxFreq) {
                    maxFreq = f;
                    maxNum = num;
                }
            }
            result[i] = maxNum;
            freq.put(maxNum, 0);
        }
        return result;
    }
}
