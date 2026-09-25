class Solution {
    public int majorityElement(int[] nums) {
        // Bit Manipulation
        int majority = 0;
        int bitmask = nums.length;
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            int bitMask = 1 << i;
            for (int num : nums) {
                if ((num & bitMask) != 0) {
                    bitCount++;
                }
            }
            if (bitCount > nums.length/2) {
                majority |= bitMask;
            }
        }
        return majority;
    }
}