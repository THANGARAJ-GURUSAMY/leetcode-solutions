class Solution {
    public int minDeletionSize(String[] strs) {
        int c = 0;

        for (int j = 0; j < strs[0].length(); j++) {
            StringBuilder sb = new StringBuilder();

            for (String m : strs) {
                sb.append(m.charAt(j));
            }

            String col = sb.toString();

            char[] a = col.toCharArray();
            Arrays.sort(a);
            String res = new String(a);

            if (!col.equals(res)) {
                c++;
            }
        }

        return c;
    }
}