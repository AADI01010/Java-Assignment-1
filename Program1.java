package Assignment.Arrays;
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr =new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i]=in.nextInt();
        }
        System.out.println("Printing the Array...");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
