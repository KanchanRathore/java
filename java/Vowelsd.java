import java.util.Scanner;
public class Vowelsd {
   public static void No_of_vowels(String str) {
       int count = 0;
       String[] Fs = str.split("");
       for (int i = 0; i <= Fs.length - 1; i++) {
           if (Fs[i].equals("A") || Fs[i].equals("a") || Fs[i].equals("E") || Fs[i].equals("e") || Fs[i].equals("I") || Fs[i].equals("i") || Fs[i].equals("o") || Fs[i].equals("O") || Fs[i].equals("u") || Fs[i].equals("U")) {
               count++;
           }
       }
       if (count != 0) {
           System.out.println(count);
       } else {
           System.out.println(0);
       }
   }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String");
            String str = sc.nextLine();
            No_of_vowels(str);


        }
        }

