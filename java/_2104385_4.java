import java.util.Arrays;
import java.util.Scanner;

public class _2104385_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of space separated integers: ");
        String numbersString = scanner.nextLine();

        String[] numbersArray = numbersString.split(" ");
        int[] numbers = new int[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i]);
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
