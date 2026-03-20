class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;

        int fourone = 0;
        int temp = n;

        while (temp > 0) {
            fourone = (fourone << 1) | 1;
            temp >>= 1;
        }

        return n ^ fourone;
    }
}