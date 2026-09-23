class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            target = nums[i];
            if (target == val) {
                continue;
            }
            nums[count++] = target;
        }
        return count;
    }
}