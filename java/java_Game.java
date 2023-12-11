import java.util.Random;
import java.util.Scanner;
class property{
    public property(){
       Random r = new Random(100);
    }
    public  int takeUserInput()
    {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            return a;
    }
}

public class java_Game {
    public static void main(String[] args)
    {
         property  prop= new property();
         while(true)
         {
             prop.takeUserInput();
         }
    }


}
