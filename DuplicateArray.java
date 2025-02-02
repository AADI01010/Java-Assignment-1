package Assignment.Arrays;
import java.util.Scanner;
public class DuplicateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the number you want to find in array: ");
        int num = in.nextInt();
        boolean flag = false;
        int count=0;
        for (int k : arr) {
            if (k == num) {
                flag = true;
                count=count+1;
            }
        }
        System.out.println("Printing the Array...");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("The element "+num+" you have entered is present "+count+" times in the array ");
        if (flag) {
            System.out.println("Element is present in array");
        } else {
            System.out.println("Element not found");
        }


    }
}
