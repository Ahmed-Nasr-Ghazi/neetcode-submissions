class Solution {
    public String longestCommonPrefix(String[] strs) {
        //["dag","danger","damage"]
        // "dance"
        String prefix = strs[0]; //dance
        for (int i = 1; i < strs.length; i++) {
            for (int j = prefix.length(); j >= 0; j--) {
                if (!strs[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                } else {
                    break;
                }
            }    
        }
        return prefix;
    }
}