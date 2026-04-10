package dsa.dataStructures.nonLinear.graphs.questions;
/*ℹ️⭐⭐⭐ℹ️
Given a grid of size n*m (n is the number of rows and m is the number of columns in the grid)
consisting of 'W's (Water) and 'L's (Land). Find the number of islands.

Note: An island is either surrounded by water or the boundary of a grid and
is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.
*/
 class Solution {
     //Direcirection 8 top,bottom,right,left&4 diagnals
    int[] dx={-1,-1,-1,0,0,1,1,1};
    int[] dy={-1,0,1,-1,1,-1,0,1};
    public int countIslands(char[][] grid) {
        int n=grid.length;//it describe about the row
        int m=grid[0].length;//it give the no of columns
        int islandsCount=0;
        boolean[][] visited=new boolean[n][m];
        //💠Traverse the each cell
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //If its a land & not visited, do a dfs call & count
                if(grid[i][j]=='L'&& !visited[i][j]){
                    //Call the dfs from that cell & visit whole island
                    dfs(i,j,grid,visited,n,m);
                    islandsCount++;
                }
            }
        }
        return islandsCount;

    }
    void dfs(int x,int y,char[][] grid,boolean[][] visited,int n,int m){
        visited[x][y]=true;
        //8 directions
        for(int dir=0;dir<7;dir++){
            int newX=x+dx[dir];
            int newY=y+dy[dir];
            //make sure the values are isnide the boundary
            //they should be lands 'L' & should not be visited
            if(newX>=0 && newY>=0 && newX<n && newY<m && grid[newX][newY]=='L' && !visited[newX][newY]){
                dfs(newX,newY,grid,visited,n,m);
            }
        }
    }

}
