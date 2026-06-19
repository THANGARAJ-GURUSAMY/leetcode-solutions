class Solution {
    public boolean equalFrequency(String word) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char ch : map.keySet()) {

            map.put(ch, map.get(ch) - 1);

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(char c : map.keySet()) {
                if(map.get(c) > 0) {
                    min = Math.min(min, map.get(c));
                    max = Math.max(max, map.get(c));
                }
            }

            map.put(ch, map.get(ch) + 1);

            if(min == max) {
                return true;
            }
        }

        return false;
    }
}