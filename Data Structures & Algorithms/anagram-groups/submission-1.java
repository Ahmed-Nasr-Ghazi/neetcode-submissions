class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapList = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String charResult = String.valueOf(charArray);
            if (mapList.get(charResult) == null) {
                mapList.put(charResult, new ArrayList<>(Arrays.asList(strs[i])));
            } else {
                mapList.get(charResult).add(strs[i]);
            }
        }
        List<List<String>> resultList = new ArrayList<>();
        mapList.forEach((k, v) -> {
            resultList.add(v);
        });
        return resultList;
    }
}
