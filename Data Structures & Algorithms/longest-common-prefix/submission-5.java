class Solution {
    public String longestCommonPrefix(String[] strs) {
        //["dance","dag","danger","damage"]
        String resultStr = strs[0]; //dance
        for (int i = 1; i < strs.length; i++) {
            // check
            if (strs[i].startsWith(resultStr)) {
                continue;
            } else {
                //remove
                for (int j = resultStr.length(); j >= 0; j--) {
                    resultStr = resultStr.substring(0, resultStr.length() - 1);

                    if (strs[i].startsWith(resultStr)) {
                        break;
                    }
                }
            }
        }
        return resultStr;
    }
}