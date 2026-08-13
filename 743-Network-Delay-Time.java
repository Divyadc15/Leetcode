class Solution {
    static class Pair {
        int node;
        int weight;
        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < times.length; i++) {
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            adj.get(u).add(new Pair(v, w));
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.weight, b.weight));
        dist[k] = 0;
        pq.offer(new Pair(k, 0));
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;
            int d1 = current.weight;
            if (dist[node] < d1) {
                continue;
            }
            for (Pair neigh : adj.get(node)) {
                int dest = neigh.node;
                int d2 = neigh.weight;
                if (dist[dest] > dist[node] + d2) {
                    dist[dest] = dist[node] + d2;
                    pq.offer(new Pair(dest, dist[dest]));
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }
            ans = Math.max(ans, dist[i]);
        }
        return ans;
    }
}