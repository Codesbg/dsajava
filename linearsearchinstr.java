package javapractice;

import java.lang.String;
import java.util.Scanner;
public class linearsearchinstr {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String str = s.nextLine();
        System.out.println("enter your target element");
        String target = s.next();
        Searchstr(str, target);
    }

    public static boolean Searchstr(String str, String target) {
        if (str.length() == 0) {
            return false;
        }

       /* for (int i =0 ; i<str.length(); i++){
            int index = str.charAt(i);

            if(target.compareTo(index)){
                return true;
            }

        }
        return false;
    }*/
        return true;
    }
}
