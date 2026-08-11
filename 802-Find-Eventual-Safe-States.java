class Solution {
    public List<Integer> eventualSafeNodes(int[][] adj) {
        int n = adj.length;
        List<Integer> ans = new ArrayList<>();
        int[] visited = new int[n];
        int[] safe = new int[n];
        for (int i = 0; i < n; i++) {
            if (issafe(i, adj, visited, safe)) {
                ans.add(i);
            }
        }
        return ans;
    }
    boolean issafe(int node, int[][] adj, int[] visited, int[] safe) {
        // Already known
        if (safe[node] == 1) return true;
        // Cycle detected
        if (visited[node] == 1) return false;
        visited[node] = 1;
        for (int neigh : adj[node]) {
            if (!issafe(neigh, adj, visited, safe)) {
                return false;
            }
        }
        // All neighbours are safe
        visited[node] = 0;
        safe[node] = 1;
        return true;
    }
}