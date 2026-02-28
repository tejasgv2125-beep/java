package day6.arrays;

public class E3 {
    public static void main(String[] args) {
        //Types

        //1D
        int[] arr={1,2,3,4,5};

        //2D Array->Array of Array-Matrix
        int[][] matrix ={{1,2,3},//row 0
                        {4,5,6},//row 1
                        {7,8,9}};//row 2[3x3} Square Matrix
        //⭐⭐⭐FOR TRAVERSAL WE SHOULD USE TWO FOR LOOPS
        //⭐⭐⭐NO OF ROWS IS THE LENGTH OF ARRAY
        System.out.println(matrix.length);//give the legth of row or length of matrix
        System.out.println(matrix[0].length);//describe the legth of paerticular column
        //⭐⭐⭐array.length=rows array[row].length=cols

        //Jagged Array-
        //In 2D Array if the row length is not same
        //in jagged array the row length will not be same
        //HERE LEGTH OF THE BIGGER ARRAY IS IS THE LENGTH OF THE JAGGED ARRAY
        int[][] jagged={{1,2,3},
                        {4,5},
                        {7,8,9,10}};
        System.out.println(jagged[0].length);
        System.out.println(jagged[1].length);
        System.out.println(jagged[2].length);
        //TRAVERSAL -TWO FOR LOOP
        //⭐⭐⭐array.length=rows array[row].length=cols
        for(int r = 0; r <jagged.length; r++){
            for(int c = 0; c<jagged[r].length; c++){
                System.out.print(jagged[r][c]+" ");
            }
            System.out.println();
        }
        //For each Loop
        for(int[] a:jagged){
            for(int x:a){
                System.out.print(x+" ");
            }
            System.out.println();
            // if dont give this it will print in one line
            //1 2 3 4 5 7 8 9 10
        }
//        char[][] names =new char{{'T','E','J','A','S'},{'S','H','R','E','Y','A'},{'S','H','R','E','Y','U'}};
//        for(char[][] a:names){
//            for(char x:a){
//                System.out.print(x+" ");
//            }
//        }

    }

}
