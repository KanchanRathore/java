import java.util.Scanner;
public class _2104385_2 {
    public static void main(String[] args) {
        System.out.println("Enter today's date in yyyy-MM-dd Format");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] SS = str.split("-");
        String result = "";
        for(int i = SS.length-1; i>=0;i--){
            result += SS[i]+" ";
        }
        String FinalString = result.substring(0, result.length()-1);
        System.out.println(FinalString.replace(" ","/"));

    }
}
