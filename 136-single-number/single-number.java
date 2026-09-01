class Solution {
    public int singleNumber(int[] nums) {
        int xr = 0;

        // XOR all elements of the array
        for (int num : nums) {
            xr = xr ^ num;
        }

        // After all XOR operations, only the single number remains
        return xr;
    }
}