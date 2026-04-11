package dsa.dataStructures.nonLinear.graphs.algos;
import java.util.*;
public class DijkstrasPQMinHeap {
    public static List<Integer> dijkstra(int V, List<List<Pair>> adj, int S) {
        //💠Sorting the pq according to the minimum distance
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));
        //💠Initially the distance array hass all large value(unreachable)
        List<Integer> disTo = new ArrayList<>(
                //💠for the copying all the collection we use the built in function which is n coipes
                Collections.nCopies(V, Integer.MAX_VALUE));
        disTo.set(S, 0);
        pq.offer(new Pair(S, 0));
        //If we get a better distance - update[Relaxation]
        while (!pq.isEmpty()) {
            Pair current = pq.poll();//{dist,node}
            int node = current.node;
            int dist = current.distance;
            for (Pair neighbour : adj.get(node)) {
                int v = neighbour.node;
                int w = neighbour.distance;
                if (dist + w < disTo.get(v)) {
                    disTo.set(v, dist + w);//💠Relation of the edges
                    pq.offer(new Pair(v, dist + w));
                }
            }
        }
        return disTo;
    }

    //💠💠💠We should create the pair of the key and value
    static class Pair {
        int node, distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        int V = 6, S = 0;
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 1; i <= V; i++) {
            //💠Adding the empty array for the storage
            adj.add(new ArrayList<>());
        }
        //⭐Undirected Weighted graph
        adj.get(0).add(new Pair(1, 4));
        adj.get(0).add(new Pair(2, 4));
        adj.get(1).add(new Pair(0, 4));
        adj.get(1).add(new Pair(2, 2));
        adj.get(2).add(new Pair(0, 4));
        adj.get(2).add(new Pair(1, 2));
        adj.get(2).add(new Pair(3, 3));
        adj.get(2).add(new Pair(4, 1));
        adj.get(2).add(new Pair(5, 6));
        adj.get(3).add(new Pair(2, 3));
        adj.get(3).add(new Pair(5, 2));
        adj.get(4).add(new Pair(2, 1));
        adj.get(4).add(new Pair(5, 3));
        adj.get(5).add(new Pair(2, 6));
        adj.get(5).add(new Pair(3, 2));
        adj.get(5).add(new Pair(4, 3));
        List<Integer> shortestDistanceArray = dijkstra(V, adj, S);
        System.out.println("Shortest Distance from node:" + S + ":");
        for (int i = 0; i < V; i++) {
            System.out.print(shortestDistanceArray.get(i) + " ");
        }
        System.out.println();
    }
}