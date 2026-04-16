class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;

       
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> res = new ArrayList<>();

        for (int t : queries) {
            List<Integer> list = map.get(nums[t]);

            if (list.size() == 1) {
                res.add(-1);
                continue;
            }

            int idx = Collections.binarySearch(list, t);
            int minDist = Integer.MAX_VALUE;

           
            int next = list.get((idx + 1) % list.size());
            int dist1 = Math.abs(next - t);
            dist1 = Math.min(dist1, n - dist1);

            int prev = list.get((idx - 1 + list.size()) % list.size());
            int dist2 = Math.abs(prev - t);
            dist2 = Math.min(dist2, n - dist2);

            minDist = Math.min(dist1, dist2);
            res.add(minDist);
        }

        return res;
    }
}