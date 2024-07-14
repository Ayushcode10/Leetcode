import java.util.ArrayList;
import java.util.Arrays;

public class Leet{

    public static void main(String[] args){

        int[][] a = {{10,20,30,40},
                     {15,25,35,45},
                     {28,29,37,49},
                     {33,34,38,50}};

        System.out.println(Arrays.toString(search(a, 37)));

    }

    public static int[] search(int[][] matrix , int target){

        //this is the start element of the matrix
        int r =0;

        //this is the last element of the row (i.e 40 for the first case)
        int c = matrix.length-1;


        /*this loop will run while the first element of the 
         row selected is less than the matrix length(which is 4 in this case)
         and  the last element is greater than 0
        */
        while(r<matrix.length && c>=0){

            
                        /* search space -->
                                 {{10,20,30,40},
                                 {15,25,35,45},
                                 {28,29,37,49},
                                 {33,34,38,50}};
                        */ 
            //if the element is found return the index
            if(matrix[r][c]==target){
                return new int[]{r+1,c+1};
            }


            /*
             * search space --> iteration 1
             *       {15,25,35,45},
                     {28,29,37,49},
                     {33,34,38,50}};


                     serach space --> iteration 2
                     
                     {{28,29,37},
                     {33,34,38}};
             */
            //if the element is less than the target increment the row
            else if (matrix[r][c]<target){
                r++;
            }

            /*
             * search space -->
             *       ,
                     {{15,25,35},
                     {28,29,37}
                     {33,34,38}};
             */

            //if the element is greater than the target decrement the column
            //because if the target is less than matrix[c] it will be in the previous column
            else{
                c--;
            }
        }

        //if the element is not found return -1,-1
        return new int[]{-1,-1};
    }
}