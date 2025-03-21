package javapractice;

import java.lang.String;
import java.util.Scanner;
public class stringbuild {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
      // string in java is immutable
        // to heap me store hoga na ki stack me yaha sirf string me
        // pointer ek ke bad ek ko point karega
        /* now string builder me wo directly store hue string mr hi edit hoga
        */

        StringBuilder str = new StringBuilder("shitij");
        System.out.println(str);
        /*System.out.println(str.charAt(0));
         str.setCharAt(0, 'k');
        System.out.println(str);


        str.insert(0 , 's');
        System.out.println(str);
        */
         for ( int i=0 ; i<str.length()/2 ; i++){
             int front = i ;
             int back = str.length()-1-i;
             // matlab agar 5 hai ya 6 number of string to usko 6-1-0 pe rakh do matlab 5 pe
             char frontChar = str.charAt(front);
             char backChar = str.charAt(back);
             str.setCharAt(front,backChar);
             str.setCharAt(back,frontChar);

         }
        System.out.println(str);
    }
}
