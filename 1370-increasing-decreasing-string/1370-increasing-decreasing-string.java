class Solution {
    public String sortString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new TreeSet<>();

        for (char c : s.toCharArray()) {
            set.add(c);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        String res = "";
        for (char c : set) {
            res += c;
        }

        String res1 = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            res1 += res.charAt(i);
        }

        StringBuilder sb = new StringBuilder();

        while (sb.length() < s.length()) {

            for (int i = 0; i < res.length(); i++) {
                char ch = res.charAt(i);
                if (map.get(ch) > 0) {
                    sb.append(ch);
                    map.put(ch, map.get(ch) - 1);
                }
            }

            for (int i = 0; i < res1.length(); i++) {
                char ch = res1.charAt(i);
                if (map.get(ch) > 0) {
                    sb.append(ch);
                    map.put(ch, map.get(ch) - 1);
                }
            }
        }

        return sb.toString();
    }
}