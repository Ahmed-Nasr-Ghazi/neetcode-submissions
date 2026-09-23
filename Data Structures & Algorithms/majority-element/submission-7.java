class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            resultMap.put(nums[i], resultMap.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0, index = 0;
        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                index = entry.getKey();
            }
        }
        return index;
    }
}