import java.util.Scanner;
public class bard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Print the length of the string.
        int length = input.length();
        System.out.println("The length of the string is: " + length);

        // Convert the string to uppercase.
        String uppercase = input.toUpperCase();
        System.out.println("The uppercase string is: " + uppercase);

        // Check if the string contains a specific substring (case-insensitive).
        String substring = input.split(" ")[0];
        boolean containsSubstring = input.toLowerCase().contains(substring.toLowerCase());
        System.out.println("The string contains the substring: " + containsSubstring);
    }
}
