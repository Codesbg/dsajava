package javapractice;

import java.lang.String;
import java.util.Scanner;
public class maxdigitsumofarray {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        System.out.println("number of rows");
        int n = s.nextInt();
        System.out.println("number of columns");
        int m = s.nextInt();
        int arr[][]= new int[n][m];

        System.out.println(" enter the value of 2D javapractice.array");
        for ( int i=0 ; i<n ; i++){
            for ( int j=0 ; j<m; j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println(Maxwealth(arr));
    }
    public static int Maxwealth( int arr[][])
    {
        int ans = Integer.MIN_VALUE;
        // ye javapractice.loop number of row tak cahlega
        for(int i=0 ; i<arr.length; i++){
            //when start new column take a new sum for that row
            int sum =0;

            for(int j=0 ; j<arr[i].length; j++){
                // this javapractice.loop go through every column ki rows matlab ek ek col ke andar jo row banega
                sum=+arr[i][j];

            }
            // now we come out from sum of javapractice.array ke columns me present row
            // we are going to compare the each row ka sum
            // overall answer se check hogs ye
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
