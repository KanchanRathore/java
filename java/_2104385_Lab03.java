
import java.util.Random;
import java.util.Scanner;

    public class _2104385_Lab03 {
        private String[] randomStrings;

        public _2104385_Lab03(int N) {
            randomStrings = generateRandomStrings(N);
        }
        public long method1(int TIMES) {
            long startTime = System.nanoTime();

            StringBuilder S1 = new StringBuilder();
            Random random = new Random();

            for (int i = 0; i < TIMES; i++) {
                String randomString = randomStrings[random.nextInt(randomStrings.length)];
                S1.append(randomString);
            }

            long endTime = System.nanoTime();
            return endTime - startTime;
        }

        public long method2(int TIMES) {
            long startTime = System.nanoTime();

            StringBuffer S2 = new StringBuffer();
            Random random = new Random();

            for (int i = 0; i < TIMES; i++) {
                String randomString = randomStrings[random.nextInt(randomStrings.length)];
                S2.append(randomString);
            }

            long endTime = System.nanoTime();
            return endTime - startTime;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of random strings (N): ");
            int N = scanner.nextInt();

            _2104385_Lab03 lab = new _2104385_Lab03(N);

            System.out.print("Enter the number of times to repeat (TIMES): ");
            int TIMES = scanner.nextInt();

            long timeMethod1 = lab.method1(TIMES);
            long timeMethod2 = lab.method2(TIMES);

            System.out.println("Time taken by method 1: " + timeMethod1 + " nanoseconds");
            System.out.println("Time taken by method 2: " + timeMethod2 + " nanoseconds");
        }

        private String[] generateRandomStrings(int N) {
            String[] randomStrings = new String[N];
            Random random = new Random();

            for (int i = 0; i < N; i++) {
                int length = random.nextInt(5) + 6; // Random length between 6 and 10
                StringBuilder stringBuilder = new StringBuilder();

                for (int j = 0; j < length; j++) {
                    char randomChar = (char) (random.nextInt(26) + 'a'); // Random lowercase letter
                    stringBuilder.append(randomChar);
                }

                randomStrings[i] = stringBuilder.toString();
            }

            return randomStrings;
        }
    }
