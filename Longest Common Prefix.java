class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";  // If the input is empty, return an empty string
        }

        String prefix = strs[0];  // Assume the first string is the prefix
        for (int i = 1; i < strs.length; i++) {
            // Keep trimming the prefix while it's not found at the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);  // Trim the last character
                if (prefix.isEmpty()) {
                    return "";  // If the prefix becomes empty, no common prefix exists
                }
            }
        }
        return prefix;  // Return the longest common prefix found
    }
}
