
import java.util.Arrays;

class Solution {
    public int minOperations(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String m = new String(ch);

        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != m.charAt(i)) {
                c++;
            }
        }

        if (c == 0) {
            return 0;
        }

        if (s.length() == 2) {
            return -1;
        }

        if (s.charAt(0) == m.charAt(0) ||
            s.charAt(s.length() - 1) == m.charAt(m.length() - 1)) {
            return 1;
        }

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == m.charAt(0) ||
                s.charAt(i) == m.charAt(m.length() - 1)) {
                return 2;
            }
        }

        return 3;
    }
}
