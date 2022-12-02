import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination){

        //se guardan los bordes
        ArrayList<List<Integer>> e = new ArrayList<>();

        //se checkean los bordes
        boolean[]visited = new boolean[n];

        //inicializamos la lista
        for (int i = 0; i < n; i++){
            e.add(new ArrayList<>());
        }

        //guardamos los bordes
        for (int[] edge:edges){
            e.get(edge[0]).add(edge[1]);
            e.get(edge[1]).add(edge[0]);
        }
        return dfs (n, e,source,destination, visited);
    }

    public boolean dfs (int n, List<List <Integer>> e, int src, int dst, boolean[] visited){
        if (src==dst)return true;
        if (visited[src])return false;

        visited[src] = true;

        List<Integer>list= new ArrayList<>();
        list = e.get(src);

        for(int i: list){
            if (dfs(n,e,i,dst,visited))return true;
        }
        return false;
    }
}
