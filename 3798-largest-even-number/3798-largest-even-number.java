class Solution {
    public String largestEven(String s) {
        if (s.charAt(s.length() - 1) == '2') {
            return s;
        }

        int pos = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return "";
        }

        return s.substring(0, pos + 1);
    }
}