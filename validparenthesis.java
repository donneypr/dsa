class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        char[] array1 = new char[s.length() / 2];
        char[] array2 = new char[s.length() / 2];
        for (int i = 0; i < s.length() / 2; i++) { 
            array1[i] = s.charAt(i);
        }
        for (int j = s.length() - 1, k = 0; j >= s.length() / 2; j--, k++) {
            array2[k] = s.charAt(j);
        }
        for (int x = 0; x < array1.length; x++) {
            if (array1[x] == '(' && array2[x] != ')') {
                return false;
            }
            if (array1[x] == '[' && array2[x] != ']') {
                return false;
            }
            if (array1[x] == '{' && array2[x] != '}') {
                return false;
            }
        }
        return true;
    }
}

//fails case 3 ()[]{}