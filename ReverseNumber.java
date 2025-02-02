package Assignment.Programs;
import java.util.Scanner;
public class ReverseNumber {
    static int Check(int num){
        int temp = num;
        int r = 0;
        while (temp != 0) {
            r = r * 10 + (temp % 10); // Simplified multiplication by 10 instead of Math.pow()
            temp /= 10;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number you want to check for:");
        int num= in.nextInt();
        int number=num;
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10;
                count++;
            }
        }
        int temp = num;
        int rem = 0;
        while (temp != 0) {
            rem = (int) (rem + (temp % 10) * Math.pow(10, count-1));
            count--;
            temp /= 10;
        }
        if (rem == num) {
            System.out.println("The Number you have entered is palindrome");
            System.out.println(num + " == " + rem);
        } else {
            System.out.println("Not a Palindrome");
            System.out.println(num+ " != " + rem);

        }
        int result=Check(num);
        System.out.println((num == result) ? "Palindrome " : "Not Palindrome" );
    }
}
