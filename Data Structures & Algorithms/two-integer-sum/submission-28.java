class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2){
            return new int[]{0,1};
        }
    Map<Integer, Integer> compMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (compMap.get(target - nums[i]) != null) {
                return new int[] {compMap.get(target - nums[i]), i};
            } else {
                compMap.put(nums[i], i);
            }
        }
    return null;
    } 
}
