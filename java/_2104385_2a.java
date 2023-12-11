import java.util.Scanner;
public class _2104385_2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game();
    }

    public static void Game() {
        for (int i = 0; i <= 5; i++) {
            Scanner sc = new Scanner(System.in);
            int X = sc.nextInt();
            int number = 12356;
            int Count = 0;

            while (number != 1) {
                if (number % 2 == 0) {
                    if (X >= number) {
                        Count++;
                    }
                    number /= 2;
                } else {
                    if (X >= number) {
                        Count++;
                    }
                    number = number + 2 * number + 1;
                }
            }
            System.out.println(Count);
        }
    }
}

