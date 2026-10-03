class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> mapList = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String charResult = String.valueOf(charArray);
            if (mapList.get(charResult) == null) {
                mapList.put(charResult, new ArrayList<>(Arrays.asList(i)));
            } else {
                mapList.get(charResult).add(i);
            }
        }
        List<List<String>> resultList = new ArrayList<>();
        mapList.forEach((k, v) -> {
            List<String> singleRecord = new ArrayList<>();
            for (Integer i : v) {
                singleRecord.add(strs[i]);
            }
            resultList.add(singleRecord);
        });
        return resultList;
    }
}
