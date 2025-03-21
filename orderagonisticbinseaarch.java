package javapractice;
import java.lang.String;
import java.util.Scanner;
//un sorted array ke liye
// in order augonistic array you dont knw weather the arry is sorted on assending or decending
public class orderagonisticbinseaarch {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of element in array");
        int n = s.nextInt();
        // array initialisation
        int []nums = new int[n];
        System.out.println("enter the elements");
        for (int i=0; i<n; i++){
            nums[i]=s.nextInt();
        }

    }
}
