class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> duplicateMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (null != duplicateMap.get(nums[i])) {
                return true;
            } else {
                duplicateMap.put(nums[i], 1);
            }
        }
        return false;
    }
}