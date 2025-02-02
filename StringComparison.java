package Assignment.Programs;
public class StringComparison {
    public static void main(String[] args) {
        // Create two string objects using string literals
        String str1 = "Hello";
        String str2 = "Hello";

        // Create a new string object using 'new' keyword
        String str3 = new String("Hello");

        // Using '==' operator for comparison
        System.out.println("Using '==' operator:");
        System.out.println("str1 == str2: " + (str1 == str2));  // Should return true because both point to the same memory location
        System.out.println("str1 == str3: " + (str1 == str3));  // Should return false because str3 points to a new object

        // Using 'equals()' method for comparison
        System.out.println("\nUsing 'equals()' method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));  // Should return true because both have the same value
        System.out.println("str1.equals(str3): " + str1.equals(str3));  // Should return true because both have the same value
    }
}
