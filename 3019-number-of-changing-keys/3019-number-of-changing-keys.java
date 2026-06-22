class Solution {
    public int countKeyChanges(String s) {
        int c = 0;

        for (int i = 1; i < s.length(); i++) {
            char c1 = Character.toLowerCase(s.charAt(i - 1));
            char c2 = Character.toLowerCase(s.charAt(i));

            if (c1 != c2) {
                c++;
            }
        }

        return c;
    }
}