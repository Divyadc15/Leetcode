class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] r : richer) {
            graph[r[1]].add(r[0]);
        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 0; i < n; i++) {
            dfs(i, graph, quiet, ans);
        }
        return ans;
    }
    private int dfs(int person, List<Integer>[] graph, int[] quiet, int[] ans) {
        if (ans[person] != -1) {
            return ans[person];
        }
        ans[person] = person;
        for (int richerPerson : graph[person]) {
            int candidate = dfs(richerPerson, graph, quiet, ans);
            if (quiet[candidate] < quiet[ans[person]]) {
                ans[person] = candidate;
            }
        }
        return ans[person];
    }
}