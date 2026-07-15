

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: If the array is empty, there is no common prefix
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // 1. Sort the array alphabetically
        Arrays.sort(strs);
        
        // 2. Grab the two extremes
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        int index = 0;
        
        // 3. Compare them character by character
        while (index < first.length() && index < last.length()) {
            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                break; // Stop the moment characters don't match
            }
        }
        
        // 4. Return the common prefix found
        return first.substring(0, index);
    }
}