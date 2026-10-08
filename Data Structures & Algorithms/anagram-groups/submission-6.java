class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] strArray;
        Map<String, List<String>> resultMap1 = new HashMap<>();
        for (String s : strs) {
            strArray = new int[26];
            for (char c : s.toCharArray()) {
                strArray[c - 'a'] += 1;
            }
            StringBuilder singleResult = new StringBuilder();
            for (int i = 0; i < strArray.length; i++) {
                while (strArray[i] > 0) {
                    singleResult.append((char) (i + 'a'));
                    strArray[i]--;
                }
            }
            resultMap1.computeIfAbsent(String.valueOf(singleResult), k -> new ArrayList<>()).add(s);
        }
    return new ArrayList<>(resultMap1.values());
    }
}
