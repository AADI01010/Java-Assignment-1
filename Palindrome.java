package Assignment.Programs;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = in.nextLine();
        input = input.toLowerCase();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Reversed String: -"+sb);
        if (input.equals(sb.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
                    System.out.println("The string is not a palindrome.");
        }
    }
}
