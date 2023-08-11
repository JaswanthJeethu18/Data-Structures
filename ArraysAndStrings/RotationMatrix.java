package ArraysAndStrings;// Java program to print the elements of
// a 2 D array or matrix
import java.io.*;
class RotationMatrix {

    public static boolean rotate(int matrix[][])
    {
        if(matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;

        //Solution #2: Layer method
        for(int layer = 0 ; layer < n/2; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first ; i < last ; i++){
                // The offset value indicates how many rows the current element has moved down from the bottom-left element
                //The offset value indicates how many columns the current element has moved from the bottom-left element.
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i]= matrix[last-offset][last];
                matrix[last-offset][last]= matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        // Solution #1: Brute force method
       /* int[][] arr = new int[n][n];
        for(int i=0; i<n ; i++){
            for(int j =0 ; j<n ; j++ ){
                arr[j][n-1-i] = matrix[i][j];
            }
        }

        for(int i = 0 ; i<n;i++){
            for(int j=0 ; j<n;j++){
                System.out.println(arr[i][j]);
            }
        }*/
        return true;

    }

    public static void main(String args[])
            throws IOException
    {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                {13, 14, 15, 16}};
        System.out.println(rotate(matrix));
    }
}

