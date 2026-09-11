class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 8; c += 2) {

                    int[] need = new int[10];

                    need[a]++;
                    need[b]++;
                    need[c]++;

                    boolean ok = true;

                    for (int d = 0; d <= 9; d++) {
                        int available = 0;

                        for (int x : digits) {
                            if (x == d) {
                                available++;
                            }
                        }

                        if (need[d] > available) {
                            ok = false;
                        }
                    }

                    if (ok) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}