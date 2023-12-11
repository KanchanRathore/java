import java.util.Scanner;
public class _2104385_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        String formattingStr = sentence.replace(" ","");
        int characters = formattingStr.length();
        String[] words = sentence.split(" ");
        int Words = words.length;
        int product = characters*Words;
        System.out.println(product);

    }
}
