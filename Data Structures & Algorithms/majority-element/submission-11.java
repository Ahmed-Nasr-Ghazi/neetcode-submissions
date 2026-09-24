class Solution {
    public int majorityElement(int[] nums) {
        // HashMap
        Map<Integer, Integer> result = new HashMap<>();
        int res = 0; int max = 0;
        for (int num : nums) {
            result.put(num, result.getOrDefault(num, 0) + 1);
            if (result.get(num) > max) {
                max = result.get(num);
                res = num;
            }
        }
        return res;
    }
}