class Solution {
    public int minDeletion(String s, int k) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        List<Integer> list = new ArrayList<>();

        for (int f : freq) {
            if (f > 0) {
                list.add(f);
            }
        }

        if (list.size() <= k) {
            return 0;
        }

        Collections.sort(list);

        int ans = 0;
        for (int i = 0; i < list.size() - k; i++) {
            ans += list.get(i);
        }

        return ans;
    }
}