package Assignment.Programs;
import java.util.Scanner;
public class IsPrimeLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String response = "yes";
        while (response.equals("yes")) {
            System.out.print("Enter a number to check if it's prime: ");
            int n = in.nextInt();
            if (n <= 1) {
                System.out.println("Not Prime");
            } else {
                boolean isPrime = true;
                for (int i = 2; i <=Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                System.out.println(isPrime ? "Prime" : "Not Prime");
            }
            System.out.print("Do you want to continue? (yes/no): ");
            response = in.next().toLowerCase();
        }
        System.out.println("Exiting...");
    }
}
