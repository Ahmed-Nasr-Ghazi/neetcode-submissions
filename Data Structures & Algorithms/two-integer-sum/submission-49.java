class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (resMap.containsKey(target - nums[i])) {
                return new int[] {resMap.get(target - nums[i]), i};
            } else {
                resMap.put(nums[i], i);
            }
        }
        return null;
    }
}