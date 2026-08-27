class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> compMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (compMap.containsKey(target - nums[i])) {
                return new int[] {compMap.get(target - nums[i]), i};
            }
            compMap.put(nums[i], i);
        
        }
    return null;
    } 
}
