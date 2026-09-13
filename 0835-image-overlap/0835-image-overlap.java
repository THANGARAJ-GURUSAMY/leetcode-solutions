class Solution {

    public int largestOverlap(int[][] img1, int[][] img2) {

        int n1 = 0;
        int n2 = 0;

        for (int i = 0; i < img1.length; i++) {
            for (int j = 0; j < img1[0].length; j++) {

                if (img1[i][j] == 1) {
                    n1++;
                }

                if (img2[i][j] == 1) {
                    n2++;
                }
            }
        }

        int ans = 0;

        for (int r = -img1.length + 1; r < img1.length; r++) {

            for (int c = -img1.length + 1; c < img1.length; c++) {

                int count = 0;

                for (int i = 0; i < img1.length; i++) {

                    for (int j = 0; j < img1.length; j++) {

                        int x = i + r;
                        int y = j + c;

                        if (x >= 0 && x < img1.length &&
                            y >= 0 && y < img1.length) {

                            if (img1[i][j] == 1 && img2[x][y] == 1) {
                                count++;
                            }
                        }
                    }
                }

                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}