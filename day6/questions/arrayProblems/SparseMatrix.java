package day6.questions.arrayProblems;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {0,0,3},
                {0,0,0},
                {4,0,0}
        };
        int rows=matrix.length;
        int cols=matrix[0].length;//only do it for the square matrix
        int zeroCount=0;
        int nonZeroCount=0;
        //TRAVRSE THE MATRIX
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    zeroCount++;
                }else{
                    nonZeroCount++;
                }
            }
        }
        System.out.println("zeros"+zeroCount);
        System.out.println("nonzeros"+nonZeroCount);
        System.out.println(zeroCount>nonZeroCount? "Sparse":"Not Sparse");

    }
}
