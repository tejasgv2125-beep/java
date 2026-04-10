package dsa.dataStructures.nonLinear.graphs.traversal;

import java.util.ArrayList;
import java.util.List;

class GraphDFS{
    private void dfs(int node, List<List<Integer>> adjList,boolean[] visited,List<Integer> ans){
        visited[node]=true;
        ans.add(node);
        //Traverse the neighbours if not visited and do the DFS call
        for(int neighbor:adjList.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor,adjList,visited,ans);
            }

        }

    }
    public List<Integer> dfsGraph(int V,List<List<Integer>> adjList){
        boolean[] visited=new boolean[V +1];//for both 0&1
        List<Integer> ans=new ArrayList<>();
        int start=1;//its only for our example
        dfs(start,adjList,visited,ans);
        return ans;
    }
}
public class DFSGraph {
    public static void main(String[] args) {
        int v=5;//Number of nodes
        List<List<Integer>> adjList=new ArrayList<>();

        for (int i=0;i<=v;i++){
            adjList.add(new ArrayList<>());
        }
        //Adding the edges(Undirected Graph)
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,4);
        addEdge(adjList,2,5);
        addEdge(adjList,4,5);
        GraphDFS obj=new GraphDFS();
        List<Integer> ans=obj.dfsGraph(v,adjList);
        printDFS(ans);
    }
    public static void addEdge(List<List<Integer>> adjList,int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);//Undirected u<-->v
    }
    public static void printDFS(List<Integer> ans){
        for(int num:ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
