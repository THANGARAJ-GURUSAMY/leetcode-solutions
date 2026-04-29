class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        
        int size = m * n;
        int[] arr = new int[size];
        
        int k = 0;
        for (int[] row : grid) {
            for (int val : row) {
                arr[k++] = val;
            }
        }

        int rem = arr[0] % x;
        for (int val : arr) {
            if (val % x != rem) return -1;
        }
        

        Arrays.sort(arr);
        

        int median = arr[size / 2];
        

        int ops = 0;
        for (int val : arr) {
            ops += Math.abs(val - median) / x;
        }
        
        return ops;
    }
}