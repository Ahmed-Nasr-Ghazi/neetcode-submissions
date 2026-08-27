class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2){
            return new int[]{0,1};
        }
    Map<Integer, Integer> compMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            compMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (compMap.containsKey(target - nums[i]) && compMap.get(target - nums[i]) > i) {
                return new int[] {i, compMap.get(target - nums[i])};
            }
        }
    return null;
    } 
}
