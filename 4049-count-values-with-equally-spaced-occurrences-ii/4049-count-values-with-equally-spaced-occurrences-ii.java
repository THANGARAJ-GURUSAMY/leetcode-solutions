class Solution {

    public int countSpecialIntegers(int[] nums) {

        Map<Integer, List<Integer>> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (!m.containsKey(nums[i])) {
                m.put(nums[i], new ArrayList<>());
            }

            m.get(nums[i]).add(i);
        }

        int c = 0;

        for (int k : m.keySet()) {

            List<Integer> a = m.get(k);

            int n = a.size();

            if (n >= 3) {

                int num = a.get(1) - a.get(0);
                boolean f = true;

                for (int i = 2; i < n; i++) {

                    int num1 = a.get(i) - a.get(i - 1);

                    if (num != num1) {
                        f = false;
                        break;
                    }
                }

                if (f) {
                    c++;
                }
            }
        }

        return c;
    }
}

