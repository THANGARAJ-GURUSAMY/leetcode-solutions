class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        
        int n = source.length;
        int[] parent = new int[n];
        
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }

      
        for(int i = 0; i < allowedSwaps.length; i++) {
            int x = allowedSwaps[i][0];
            int y = allowedSwaps[i][1];
            union(parent, x, y);
        }

       
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

      
        for(int i = 0; i < n; i++) {
            int p = find(parent, i);
            map.putIfAbsent(p, new HashMap<>());
            map.get(p).put(source[i], map.get(p).getOrDefault(source[i], 0) + 1);
        }

        int c = 0;

       
        for(int i = 0; i < n; i++) {
            int p = find(parent, i);
            Map<Integer, Integer> freq = map.get(p);

            if(freq.getOrDefault(target[i], 0) > 0) {
                freq.put(target[i], freq.get(target[i]) - 1);
            } else {
                c++;
            }
        }

        return c;
    }

    
    private int find(int[] parent, int x) {
        if(parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }

  
    private void union(int[] parent, int x, int y) {
        parent[find(parent, x)] = find(parent, y);
    }
}