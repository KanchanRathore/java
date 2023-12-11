import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class kyu {
    public static void main(String[] args) {
        int Output =  Game(78);
        FileInputStream inputStream = new FileInputStream("2a.inp.txt");

        // Read the input
        int data = inputStream.read();
        while (data != -1) {
            System.out.println((char) data);
            data = inputStream.read();
        }
        inputStream.close();
        System.out.println(Output);
    }

    public static int Game(int number) {
        int Count = 0;
        while (number != 1) {
            if (number % 2 == 0) {
                if (data >= number) {
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
        return Count;
    }
}

