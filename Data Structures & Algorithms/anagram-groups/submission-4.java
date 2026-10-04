class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapList = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String stringResult = String.valueOf(charArray);
            mapList.computeIfAbsent(stringResult, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(mapList.values());
    }
}
