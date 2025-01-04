class Solution {
    public int lengthOfLastWord(String s) {
        int x = 0;
        int j = s.length()-1;
        while (j >= 0 && s.charAt(j) == ' ') {
            j--;
        }
         while (j >= 0 && s.charAt(j) != ' ') {
            x++;
            j--;
    }
    return x;
    }
}


