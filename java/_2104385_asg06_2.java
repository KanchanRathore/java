import java.util.Random;

public class  _2104385_asg06_2{

    static final int N = 1000; // Change this to adjust matrix size

    // Initialize matrices A and B
    static int[][] A = new int[N][N];
    static int[][] B = new int[N][N];

    static int[][] resultSingleThreaded = new int[N][N];
    static int[][] resultMultiThreaded = new int[N][N];

    static class SingleThreadedMultiplier {
        public void multiply() {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        resultSingleThreaded[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }
    }

    static class MultiThreadedMultiplier extends Thread {
        private final int startRow;
        private final int endRow;

        public MultiThreadedMultiplier(int startRow, int endRow) {
            this.startRow = startRow;
            this.endRow = endRow;
        }

        @Override
        public void run() {
            for (int i = startRow; i < endRow; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        resultMultiThreaded[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        // Initialize matrices A and B with random values
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = rand.nextInt(10);
                B[i][j] = rand.nextInt(10);
            }
        }

        long startTimeSingleThreaded = System.currentTimeMillis();

        SingleThreadedMultiplier singleThreadedMultiplier = new SingleThreadedMultiplier();
        singleThreadedMultiplier.multiply();

        long endTimeSingleThreaded = System.currentTimeMillis();
        long executionTimeSingleThreaded = endTimeSingleThreaded - startTimeSingleThreaded;

        System.out.println("Single-threaded execution time: " + executionTimeSingleThreaded + " milliseconds");

        long startTimeMultiThreaded = System.currentTimeMillis();

        int numThreads = 4; // Adjust this to change the number of threads
        int rowsPerThread = N / numThreads;
        int remainingRows = N % numThreads;

        Thread[] threads = new Thread[numThreads];

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            int startRow = i * rowsPerThread;
            int endRow = startRow + rowsPerThread;
            if (i == numThreads - 1) {
                endRow += remainingRows; // Add remaining rows to the last thread
            }

            threads[i] = new MultiThreadedMultiplier(startRow, endRow);
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

        long endTimeMultiThreaded = System.currentTimeMillis();
        long executionTimeMultiThreaded = endTimeMultiThreaded - startTimeMultiThreaded;

        System.out.println("Multi-threaded execution time: " + executionTimeMultiThreaded + " milliseconds");

        // Print results
        System.out.println("Single-threaded result:");
        printMatrix(resultSingleThreaded);

        System.out.println("Multi-threaded result:");
        printMatrix(resultMultiThreaded);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
