class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resMap = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = target - nums[i];
            if (resMap.containsKey(result)) {
                return new int[] {resMap.get(result), i};
            } else {
                resMap.put(nums[i], i);
            }
        }
        return null;
    }
}