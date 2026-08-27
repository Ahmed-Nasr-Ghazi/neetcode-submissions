class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length * 2];
        int val = 0;
        for (int i = 0; i < length; i++) {
            val = nums[i];
            ans[i] = val;
            ans[i + length] = val;
        }
        return ans;
    }
}