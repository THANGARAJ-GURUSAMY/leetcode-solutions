class Solution {
    public int similarPairs(String[] words) {
        int count = 0;

        for(int i = 0; i < words.length; i++) {
            Set<Character> s1 = new HashSet<>();

            for(char c : words[i].toCharArray()) {
                s1.add(c);
            }

            for(int j = i + 1; j < words.length; j++) {
                Set<Character> s2 = new HashSet<>();

                for(char c : words[j].toCharArray()) {
                    s2.add(c);
                }

                if(s1.equals(s2)) {
                    count++;
                }
            }
        }

        return count;
    }
}