class Solution {
    public String longestCommonPrefix(String[] strs) {
        //["dance","dag","danger","damage"]
        String resultStr = strs[0]; //dance
        for (int i = 1; i < strs.length; i++) {
            System.out.println("Index " + i);
            // check
            System.out.println("First comparing " + strs[i] + " with " + resultStr);
            if (strs[i].startsWith(resultStr)) {
                System.out.println("First resultStr: True the " + strs[i] + " starts with " + resultStr);
                continue;
            } else {
                //remove
                for (int j = resultStr.length(); j >= 0; j--) {
                    System.out.println("resultStr length " + resultStr.length());
                    resultStr = resultStr.substring(0, resultStr.length() - 1);
                    if (resultStr.length() == 1) {
                        System.out.println("Empty");
                    }
                    System.out.println("resultStr length " + resultStr.length() + " and " + 1);
                    System.out.println("Second comparing target " + strs[i] + " with " + resultStr);
                    if (strs[i].startsWith(resultStr)) {
                        System.out.println("Second resultStr: True");
                        break;
                    }
                }
                System.out.println("After inner Loop: " + resultStr);
            }
        }
        return resultStr;
    }
}