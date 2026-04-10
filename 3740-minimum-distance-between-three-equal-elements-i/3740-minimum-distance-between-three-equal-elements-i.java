class Solution {
    public int minimumDistance(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int t : nums) {
            set.add(t);
        }

        int tot = Integer.MAX_VALUE;

        for (int t : set) {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == t) {
                    list.add(i);
                }
            }

            if (list.size() >= 3) {
                for (int i = 0; i <= list.size() - 3; i++) {
                    int n1 = list.get(i);
                    int n2 = list.get(i + 1);
                    int n3 = list.get(i + 2);

                    int tu = Math.abs(n1 - n2) + Math.abs(n2 - n3) + Math.abs(n1 - n3);
                    tot = Math.min(tot, tu);
                }
            }
        }

        if (tot == Integer.MAX_VALUE) {
            return -1;
        }

        return tot;
    }
}