class Solution {
    public int minJumps(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int max = 1000000;

        boolean[] prime = new boolean[max + 1];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    prime[j] = false;
                }
            }
        }

       
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = nums[i];

            for (int p = 2; p * p <= x; p++) {
                if (x % p == 0) {

                    map.computeIfAbsent(p, k -> new ArrayList<>()).add(i);

                    while (x % p == 0) {
                        x /= p;
                    }
                }
            }

            if (x > 1) {
                map.computeIfAbsent(x, k -> new ArrayList<>()).add(i);
            }
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        q.offer(0);
        vis[0] = true;

        int steps = 0;

        Set<Integer> usedPrime = new HashSet<>();

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                int i = q.poll();

                if (i == n - 1) {
                    return steps;
                }

                
                if (i - 1 >= 0 && !vis[i - 1]) {
                    vis[i - 1] = true;
                    q.offer(i - 1);
                }

                if (i + 1 < n && !vis[i + 1]) {
                    vis[i + 1] = true;
                    q.offer(i + 1);
                }

               
                int val = nums[i];

                if (prime[val] && !usedPrime.contains(val)) {

                    usedPrime.add(val);

                    List<Integer> list = map.get(val);

                    if (list != null) {
                        for (int idx : list) {

                            if (idx != i && !vis[idx]) {
                                vis[idx] = true;
                                q.offer(idx);
                            }
                        }
                    }
                }
            }

            steps++;
        }

        return -1;
    }
}