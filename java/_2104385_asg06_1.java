import java.util.Scanner;

public class _2104385_asg06_1 {

    static class MatrixAdder extends Thread {
        private final int[][] A;
        private final int[][] B;
        private final int[][] C;
        private final int startRow;
        private final int endRow;

        public MatrixAdder(int[][] A, int[][] B, int[][] C, int startRow, int endRow) {
            this.A = A;
            this.B = B;
            this.C = C;
            this.startRow = startRow;
            this.endRow = endRow;
        }

        @Override
        public void run() {
            for (int i = startRow; i < endRow; i++) {
                synchronized (C) { // Synchronize on C to avoid concurrent modification
                    for (int j = 0; j < A.length; j++) {
                        C[i][j] = A[i][j] + B[i][j];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of threads
        int N = scanner.nextInt(); // Matrix dimension

        int[][] A = new int[N][N];
        int[][] B = new int[N][N];

        // Read matrix A
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Read matrix B
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        int[][] C = new int[N][N]; // Resultant matrix

        int rowsPerThread = N / T;
        int remainingRows = N % T;

        Thread[] threads = new Thread[T];

        long startTime = System.currentTimeMillis();

        // Create and start threads
        for (int i = 0; i < T; i++) {
            int startRow = i * rowsPerThread;
            int endRow = startRow + rowsPerThread;
            if (i == T - 1) {
                endRow += remainingRows; // Add remaining rows to the last thread
            }

            threads[i] = new MatrixAdder(A, B, C, startRow, endRow);
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Print the result matrix C
        System.out.println("Resultant Matrix C:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Execution Time: " + executionTime + " milliseconds");
    }
}
