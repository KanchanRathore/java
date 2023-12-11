import java.util.Scanner;

public class _2104385_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine().trim();

        // Find the first word (substring to search for)
        String[] words = str.split("\\s+");
        String substringToSearch = words[0];

        // Calculate and print the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Convert the string to uppercase
        String uppercaseString = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        // Check if the string contains the substring (case-insensitive)
        boolean containsSubstring = str.toLowerCase().contains(substringToSearch.toLowerCase());
        //System.out.println("Contains substring '" + substringToSearch + "': " + containsSubstring);
        if(containsSubstring==true)
        {
            System.out.println("Substring Found");
        }
        if(containsSubstring==false)
        {
            System.out.println("Substring Not Found");
        }
    }
}