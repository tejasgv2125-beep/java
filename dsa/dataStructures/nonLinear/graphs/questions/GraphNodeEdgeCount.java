package dsa.dataStructures.nonLinear.graphs.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ℹ️💠💠ℹ️Count the number of nodes & edges of an undirected graph
public class GraphNodeEdgeCount {
    public static int countNodes(List<List<Integer>> adjList){
        return adjList.size();
    }
    public static int  countEdges(List<List<Integer>> adjList){
        int edges = 0;
        for(List<Integer> neighbour:adjList){
            edges+=neighbour.size();
        }
        //Science it is an undirected graph edges are counted
        //so we divide by 2
        return edges/2;
    }
    public static void main(String[] args) {
        List<List<Integer>> adjlist=new ArrayList<>();
        //Manual adding the adjacency list representation
        adjlist.add(Arrays.asList(1,2));//Node 0 //s=2
        adjlist.add(Arrays.asList(0,2,3));//Node 1 //
        adjlist.add(Arrays.asList(0,1,4));//Node 2
        adjlist.add(Arrays.asList(1,4));//Node 3
        adjlist.add(Arrays.asList(2,3));//Node 4

        int nodes = countNodes(adjlist);
        System.out.println("No of Nodes: "+nodes);
        int edges = countEdges(adjlist);
        System.out.println("No of Edges: "+edges);
    }
}
