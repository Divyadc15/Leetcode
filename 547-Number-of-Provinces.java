class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && (i != j))
                    adj.get(i).add(j);
            }
        }
        int[] vis = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                ans++;
                dfs(i, adj, vis);
            }
        }
        return ans;
    }

    void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[node]++;
        for (int neigh : adj.get(node)) {
            if (vis[neigh] == 0)
                dfs(neigh, adj, vis);
        }
    }
}