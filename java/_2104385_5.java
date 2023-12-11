import java.util.Scanner;
public class _2104385_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String reversedstring = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            reversedstring += str.charAt(i);
        }
        if(str.equals(reversedstring))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");

        }

    }
}
