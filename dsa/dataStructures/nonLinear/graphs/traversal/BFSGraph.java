package dsa.dataStructures.nonLinear.graphs.traversal;
import java.util.*;
class GraphBFS{
    //💠here we need the list because bfs is always the queue
    public List<Integer> bfsGraph(int v,List<List<Integer>> adjlist){
        //💠to store the value in the integer list
        List<Integer> bfs=new ArrayList<>();
        boolean[] visited=new boolean[v+1];//+1 woeks for 0 and 1
        Queue<Integer> queue=new LinkedList<>();
        //Starts the bfs from the node one
        visited[1]=true;
        queue.add(1);
        while (!queue.isEmpty()){
            int node =queue.poll();
            bfs.add(node);//We are storing the output one by one
            // Who are your neighbours [adj list]
            //Traverse all of its neigbhours
            for(int neigbour:adjlist.get(node)){
                if(!visited[neigbour]){
                    visited[neigbour]=true;//Mark as visited
                    queue.add(neigbour);//push the queue

                }

            }

        }
        return bfs;
    }

}
public class BFSGraph {
    public static void main(String[] args) {
        int v=5;//Number of nodes
        List<List<Integer>> adjList=new ArrayList<>();

        for (int i=0;i<=v;i++){
            adjList.add(new ArrayList<>());
        }
        //Adding the edges(Undirected Graph)
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,3);
        addEdge(adjList,3,4);
        addEdge(adjList,4,5);
        addEdge(adjList,2,5);
        GraphBFS obj=new GraphBFS();
        List<Integer> ans=obj.bfsGraph(v,adjList);
        printBfs(ans);
    }
    public static void addEdge(List<List<Integer>> adjList,int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);//Undirected u<-->v
    }
    public static void printBfs(List<Integer> ans){
        for(int num:ans) {
            System.out.print(num + " ");
        }
        System.out.println();
        }


}



