class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] vis=new boolean[n];
        dfs(0,rooms,vis);
        for(boolean v: vis){
            if(!v) return false;
        }
        return true;
    }
     private void dfs(int room, List<List<Integer>> rooms, boolean[] vis){
            if(vis[room]) return;
            vis[room]=true;
            for(int key:rooms.get(room)){
                dfs(key,rooms,vis);
            }
     } 
}