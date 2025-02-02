package Assignment.Arrays;
import java.util.Scanner;
public class LargestThreeArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr =new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i]=in.nextInt();
        }
        int max=arr[0];
        for(int j=1;j< arr.length;j++){
            if (arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("Printing the Array...");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\nLargest among three: "+max);

    }
}
