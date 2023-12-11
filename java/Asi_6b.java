import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Asi_6b {
    // Generatining Random Number Method
    static int generateRandomNumber() {
        int number = (int) (Math.random() * (9 - 1)) + 1;
        return number;
    }
    public static void main(String[] args) throws IOException {
        // Store current time
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Eelement for both Square Matrix: ");
        int n = sc.nextInt();
        // Generating First Matrix
        int[][] matrix01 = new int[n][n];
        for (int i = 0; i < matrix01.length; i++) {


            for (int j = 0; j < matrix01.length; j++) {
                matrix01[i][j] = generateRandomNumber();
            }
        }
        // Writing Matrix01 to Text File
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matrix01.length; i++)//for each row
        {
            for (int j = 0; j < matrix01.length; j++)//for each column
            {
                builder.append(matrix01[i][j] + "");//append to the output string
                if (j < matrix01.length - 1)//if this is not the last row element
                {
                    builder.append(",");//then add comma (if you don't like commas you can use)
                }
            }
            builder.append("\n");//append new line at the end of the row
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("matrix01.txt"));
        writer.write(builder.toString());//save the string representation of the board
        writer.close();
        // Generating Second Matix
        int[][] matrix02 = new int[n][n];
        for (int i = 0; i < matrix02.length; i++) {
            for (int j = 0; j < matrix02.length; j++) {
                matrix02[i][j] = generateRandomNumber();
            }
        }
        // Writing Matrix02 to Text File
        StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < matrix02.length; i++)//for each row
        {
            for (int j = 0; j < matrix02.length; j++)//for each column
            {
                builder2.append(matrix02[i][j] + "");//append to the output string
                if (j < matrix02.length - 1)//if this is not the last row element
                {
                    builder2.append(",");//then add comma (if you don't like commas you can us spaces)
                }
            }
            builder2.append("\n");//append new line at the end of the row
        }
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("matrix02.txt"));
        writer2.write(builder2.toString());//save the string representation of the board
        writer2.close();
        // Printing both 2D Arrays
        for (int[] arr : matrix01) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("");
        for (int[] arr : matrix02) {
            System.out.println(Arrays.toString(arr));
        }
        // Multiplying both matrix
        int[][] productTwoMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k=0; k<n; k++){
                    productTwoMatrix[i][j] += matrix01[i][k] * matrix02[k][j];
                }
            }
        }
        // Printing Result
        System.out.println("\nResult: ");
        for (int[] arr : productTwoMatrix) {
            System.out.println(Arrays.toString(arr));
        }
        // Calculate Execution time
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        long timeInMiliSecond = (totalTime / 1_000_000);
        System.out.println("Execution Time: "+ timeInMiliSecond + " miliseconds");
    }
}