package Assignment.Programs;
import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number you want to check for:");
        int num= in.nextInt(); //153=1^3+5^3+3^3
        int temp=num;
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
        System.out.println("the number of digits:-"+count);
        int rem=0;
        while (temp!=0){
            rem= (int) (rem+Math.pow(temp%10,count));
            temp/=10;
        }
        System.out.println((num == rem) ? "Armstrong Number " : "Not a Armstrong" );

    }
}

