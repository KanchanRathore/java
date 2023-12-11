import java.util.Scanner;
import java.util.Random;
public class RockScissorPaper {
    public static void main(String[] args) {
        System.out.println("Welcome to the game of Scissor Paper and Rock");
        int n = 1;
        int sum = 0;
        int sum2 = 0;
        while (n < 6) {
            Random rd = new Random();
            System.out.println("Enter your number (0,1,2) for choice(Rock,Paper,Scissor) ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 0 -> System.out.println("You have chosen Rock");
                case 1 -> System.out.println("YOu have chosen Paper");
                case 2 -> System.out.println("YOU have chosen Scissor");
            }
            System.out.println("Now It's Computer's Choice");
            int c = rd.nextInt(3);
            System.out.println(c);
            switch (c) {
                case 0 -> System.out.println("Computer chooses Rock");
                case 1 -> System.out.println("Computer chooses Paper");
                case 2 -> System.out.println("Computer chooses Scissor");
            }
            if (a == c) {
                System.out.println("nonone will win");
            }
            if (a == 0 && c == 2) {
                System.out.println("User Wins as Rock destroyed Scissor");
                sum++;
                System.out.println("THe score of user is "+sum);
                System.out.println("THe Score of Computer is "+sum2);


            }
            if (c == 0 && a == 2) {
                System.out.println("Computer Wins ");
                sum2++;
                System.out.println("THe Score of Computer is "+sum2);
                System.out.println("THe score of user is "+sum);
            }
            if (a == 1 && c == 0) {
                System.out.println("User Wins as Paper covers the Rock");
                sum++;
                System.out.println("THe score of user is "+sum);
                System.out.println("THe Score of Computer is "+sum2);
            }
            if (c == 1 && a == 0) {
                System.out.println("Computer wins as Paper covers the Rock");
                sum2++;
                System.out.println("THe Score of Computer is "+sum2);
                System.out.println("THe score of user is "+sum);
            }
            if (a == 2 && c == 1) {
                System.out.println("User Wins as Scissors cuts the Paper");
                sum++;
                System.out.println("THe score of user is "+sum);
                System.out.println("THe Score of Computer is "+sum2);
            }
            else if (c == 2 && a == 1) {
                System.out.println("Computer Wins as Scisor cuts the page immediately");
                sum2++;
                System.out.println("THe Score of Computer is "+sum2);
                System.out.println("THe score of user is "+sum);
            }
            n++;

        }
        System.out.println("The Final Score of Computer is "+sum2);
        System.out.println("The Final Score oF User is"+sum);
    }
}
