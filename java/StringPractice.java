import java.util.Scanner;
public class StringPractice {
    public static void main(String[] args) {
        String st = "Kanchan R athore";
       /* st = st.replace(" ","_");
        System.out.println(st);
        String Text = "Dear <!name>, Thanks a lot";
         Scanner sc = new Scanner(System.in);
         Text = Text.replace("<!name>","Kanchan");
        System.out.println(Text);
        String X = "This is not my cup oftree";
        System.out.println(X.indexOf(" "));
        System.out.println(X.indexOf("  "));*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check if you ar eligible for driving or not");
        int Age  = sc.nextInt();
        if(Age>=18) {
            System.out.println("You can drive");
        }
        else {
            System.out.println("YOu cannot drive");
        }

    }
}
