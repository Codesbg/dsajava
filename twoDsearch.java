package javapractice;

import java.lang.String;
import java.util.Scanner;
public class twoDsearch {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println(" enter the number of row");
        int row = s.nextInt();
        System.out.println("enter the number of columns");
        int column = s.nextInt();

        int twodarray [][]= new int[row][column];
        System.out.println("enter the values of javapractice.array");
        for (int i=0 ; i<row; i++){
            for (int j=0 ; j<column ; j++){
                 twodarray[i][j]=s.nextInt();
            }
        }
        System.out.println(SearchInArr(twodarray));
    }

    public static int SearchInArr(int twodarray[][]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the target");
        int target = s.nextInt();
        if (twodarray.length==0){
            return -1;
        }

        for (int i=0 ; i<twodarray.length; i++) {
            for (int j = 0; j < twodarray[i].length; j++) {
                int element = twodarray[i][j];
                if (target == element) {
                    return target;
                }

            }

        }

            System.out.println("target not present");

        return 0;
    }
}
