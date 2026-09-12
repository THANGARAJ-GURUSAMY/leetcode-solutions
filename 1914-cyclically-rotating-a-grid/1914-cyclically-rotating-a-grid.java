class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        for (int layer = 0; layer < Math.min(m, n) / 2; layer++) {

            int top = layer;
            int bottom = m - 1 - layer;
            int left = layer;
            int right = n - 1 - layer;

            // Store the layer
            int[] arr = new int[2 * (bottom - top + right - left)];

            int index = 0;

            // Top row
            for (int j = left; j <= right; j++) {
                arr[index++] = grid[top][j];
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                arr[index++] = grid[i][right];
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                arr[index++] = grid[bottom][j];
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                arr[index++] = grid[i][left];
            }

            int len = arr.length;
            int rotate = k % len;

            index = 0;

            // Top row
            for (int j = left; j <= right; j++) {
                grid[top][j] = arr[(index + rotate) % len];
                index++;
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                grid[i][right] = arr[(index + rotate) % len];
                index++;
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                grid[bottom][j] = arr[(index + rotate) % len];
                index++;
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                grid[i][left] = arr[(index + rotate) % len];
                index++;
            }
        }

        return grid;
    }
}