package Assignment.Arrays;

import java.util.Scanner;

public class LargestSmallestArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr =new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i]=in.nextInt();
        }
        int min = arr[0];
        int max=arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Minimum element is.."+min);
        System.out.println("Maximum element is.."+max);
        System.out.println("Printing the Array...");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
