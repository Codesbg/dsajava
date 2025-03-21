package javapractice;

import java.lang.String;
import java.util.Scanner;
public class linearsearchstr2 {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println(" eneter the string or line");
        String str = s.nextLine();
    }
    public static int Searchtherange ( String str , int target){
        Scanner s = new Scanner(System.in);
        System.out.println(" enter the start index");
        int start = s.nextInt();
        System.out.println(" enter the ending index");
        int end = s.nextInt();

        for (int i=start; i<=end ; i++){
            if (str.length()== target){
                return 1;
            }
        }
     return 0;
    }
}
