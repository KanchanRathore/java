import java.util.Scanner;
public class Logical {
    public static void main(String[] args) {
        /*boolean a = true;
        boolean  b = true;
        System.out.println(!(a));*/
        System.out.println("Enter your Age");
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
        if(age>67){
            System.out.println("YOu are old now");
        }
        else if(age>56)
        {
            System.out.println("U are mature enough");
        }
        else if(age>36)
        {
            System.out.println("YOu are understable");

        }
        else{
            System.out.println("YOu are very Young");
        }
    }
}
