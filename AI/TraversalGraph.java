import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TraversalGraph {
    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(dfsOfGraph(3, adjListD(m, n)));
        System.out.println(bfsOfGraph(3, adjList(m, n)));
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] visited = new int[V+1];
        dfs(1, visited, ans, adj);

        return ans;
    }

    private static void dfs(int val, int[] visited, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj){
        if(visited[val] == 1) return;

        visited[val] = 1;
        ans.add(val);
        ArrayList<Integer> lst = adj.get(val);

        for(int i : lst){
            if(visited[i] != 1){
                dfs(i, visited, ans, adj);
            }
        }
    }

    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[V+1]; //we can also create a boolean array for this
        ArrayList<Integer> bfs = new ArrayList<>();

        q.add(1);
        visited[1] = 1;

        while(!q.isEmpty()){
            int val = q.remove();
            bfs.add(val);

            ArrayList<Integer> lst = adj.get(val);

            for(int ans : lst){
                if(visited[ans] != 1){
                    q.add(ans);
                    visited[ans] = 1;
                }
            }
        }

        return bfs;
    }

    private static ArrayList<ArrayList<Integer>> adjListD(int m, int n){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges: ");
        for(int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        sc.close();

        return adj;
    }

    private static ArrayList<ArrayList<Integer>> adjList(int m, int n){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges: ");
        for(int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        sc.close();

        return adj;
    }
}