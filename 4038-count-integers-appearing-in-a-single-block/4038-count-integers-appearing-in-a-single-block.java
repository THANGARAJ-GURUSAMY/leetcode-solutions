class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int t : nums) {
            set.add(t);
        }

        int c = 0;

        for (int t : set) {
            int p = -1;
            boolean special = true;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == t) {

                    if (p == -1) {
                        p = i;
                    }
                    else {
                        if (Math.abs(p - i) == 1) {
                            p = i;
                        }
                        else {
                            special = false;
                            break;
                        }
                    }
                }
            }

            if (special) {
                c++;
            }
        }

        return c;
    }
}