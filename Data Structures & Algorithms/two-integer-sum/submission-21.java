class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2){
            return new int[]{0,1};
        }
    Map<Integer, Integer> compMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            compMap.put(i, nums[i]);
        }
        int targetValue = 0;
        int index = 0;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (compMap.containsValue(target - nums[i])){
                System.out.println(i + compMap.get(0));
                targetValue = target - nums[i];
                index = i;
                break;
//                return new int[] {i, compMap.get(i)};
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (compMap.get(i) == targetValue) {
                System.out.println(i + " " + index);
                return new int[] {i, index};
            }
        }
    return null;
    } 
}
