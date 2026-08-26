class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int min = Integer.MAX_VALUE;
        int pos1 = -1;
        int pos2 = -1;

        for (int i = 0; i < s.length(); i++) {
            int p1 = i;
            int p2 = -1;
            int c = 0;
            String res = "";

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (ch == '1') {
                    c++;
                    res += ch;

                    if (c == k) {
                        p2 = j;
                        break;
                    }
                } else {
                    res += ch;
                }
            }

            if (c == k) {
                if (res.length() < min) {
                    min = res.length();
                    pos1 = p1;
                    pos2 = p2;
                }
                else if (res.length() == min) {
                    String a = s.substring(p1, p2 + 1);
                    String b = s.substring(pos1, pos2 + 1);

                    if (a.compareTo(b) < 0) {
                        pos1 = p1;
                        pos2 = p2;
                    }
                }
            }
        }

        if (pos1 == -1) {
            return "";
        }

        return s.substring(pos1, pos2 + 1);
    }
}