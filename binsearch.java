package javapractice;
import java.util.Scanner;
import java.lang.String;
public class binsearch {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of element");
        int n = s.nextInt();
        int nums[] = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();

        }
        System.out.println(Binsearch(nums));

    }

    // return the index or element
    static int Binsearch(int nums[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the target");
        int target = s.nextInt();
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // find middle element
            //   int mid =(start+end)/2;
            // but this fromula not work for large values
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        System.out.println("element not exist !!");
        return -1;

    }
}
