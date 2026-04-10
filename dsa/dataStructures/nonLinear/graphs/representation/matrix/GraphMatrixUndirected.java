package dsa.dataStructures.nonLinear.graphs.representation.matrix;

import java.util.Scanner;

public class GraphMatrixUndirected {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //n->number of nodes
        //m->number of edges
        //We cover all the nodes,so the time complexity isO(n)
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] adjMatrix= new int[n+1][n+1];//0-based indexing
        //let's take the input of the edges from the user
        for(int i=0;i<m;i++){
            int u= sc.nextInt();
            int v= sc.nextInt();
            //Undirected Graph u<-->v
            adjMatrix[u][v]=1;
            adjMatrix[v][u]=1;//skip the line for directed graph

                }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(adjMatrix[i][j]+" ");

            }
            System.out.println();


        }
        sc.close();
    }
}
