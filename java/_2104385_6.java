import java.util.Scanner;
public class _2104385_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature and unit (C or F): ");
        String input = sc.nextLine();
        String unit = input.substring(input.length() - 1);
        double temperature = Double.parseDouble(input.substring(0, input.length() - 1));

        if (unit.equals("C")) {
            double fahrenheit = ((9.0* temperature) / 5.0) + 32.0;
            System.out.println(fahrenheit+"F");
        } else if (unit.equals("F")) {
            double celsius = (temperature - 32.0) * (5.0 / 9.0);
            System.out.println(celsius+"C");
        } else {
            System.out.println("Invalid unit.");
        }
    }
}
