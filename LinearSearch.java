package Assignment.Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr =new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the number you want to find in array: ");
        int num= in.nextInt();
        boolean flag=false;
        for (int k : arr) {
            if (k == num) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Element is present in array");
        }else{
            System.out.println("Element not found");
        }

        System.out.println("Printing the Array...");
        for (int j : arr) {
            System.out.print(j + " ");
        }


    }
}
