class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> compMap = new HashMap<>();
    int targetNums = 0;
        for (int i = 0; i < nums.length; i++) {
            targetNums = target - nums[i];
            if (compMap.containsKey(targetNums)) {
                return new int[] {compMap.get(targetNums), i};
            }
            compMap.put(nums[i], i);
        
        }
    return null;
    } 
}
