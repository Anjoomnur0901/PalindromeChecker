import java.util.*;
public class PalindromeChecker {
    public static boolean isPalindrome(String input) {          
        if (input == null) {
            System.out.println("Input is null.");
            return false;
        }
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (input.isEmpty()) {
            System.out.println("Input is empty or contains no valid characters.");
            return false;
        }
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println("Input is Palindrome.");
            return true;
        }
        else {
            System.out.println("Input is not Palindrome.");
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        isPalindrome(input);
        scanner.close(); 
    }
}
