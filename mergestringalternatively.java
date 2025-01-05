class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder outputStr = new StringBuilder();
        int max = Math.max(word1.length(), word2.length()); 

        for (int i = 0; i < max; i++) {
            if (i < word1.length()) {
                outputStr.append(word1.charAt(i)); 
            }
            if (i < word2.length()) {
                outputStr.append(word2.charAt(i)); 
            }
        }

        return outputStr.toString(); 
    }
}
