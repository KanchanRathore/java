import java.util.Scanner;
public class JavaExercise1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in maths;");
      float maths = sc.nextFloat();
        System.out.println("Enter your marks in science");
        float science = sc.nextFloat();
        System.out.println("Enter your marks in english");
        float english = sc.nextFloat();
        System.out.println("Enter your marks in hindi");
        float hindi = sc.nextFloat();
        System.out.println("Enter your marks in social science");
        float SST = sc.nextFloat();
        float sum =(maths+science+english+hindi+SST)/500;
        float percentage = sum*100;
        System.out.println("THe percentage of the student is "+percentage +"%");

    }

}
