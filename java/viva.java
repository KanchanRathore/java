import java.util.Scanner;
public class viva {
    static int No_of_vowels(String str){
        int count = 0;
        String[] Fs = str.split("");
        for(int i=0;i<= Fs.length-1;i++)
        {
            if(Fs[i].equals("A")||Fs[i].equals("a")||Fs[i].equals("E")||Fs[i].equals("e")||Fs[i].equals("I")||Fs[i].equals("i")||Fs[i].equals("o")||Fs[i].equals("O")||Fs[i].equals("u")||Fs[i].equals("U"))
            {
                count++;
            }
        }
        if(count!=0)
        {
            return count;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args){
         System.out.println("Enter a String");
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         No_of_vowels(str);


    }

}