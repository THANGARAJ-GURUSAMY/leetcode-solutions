class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];

        for (int i = 0; i < m; i++) {
            char[] row = new char[n];
            java.util.Arrays.fill(row, '#');
            grid[i] = new String(row);
        }

        char[][] arr = new char[m][n];

        for (int i = 0; i < m; i++) {
            java.util.Arrays.fill(arr[i], '#');
        }

        int i = 0, j = 0;

        while (j < n) {
            arr[i][j] = '.';
            j++;
        }

        j = n - 1;

        while (i < m) {
            arr[i][j] = '.';
            i++;
        }

        for (i = 0; i < m; i++) {
            grid[i] = new String(arr[i]);
        }

        return grid;
    }
}