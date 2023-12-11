public class Pattern_using_Recursion {

    static void Pattern_rec(int n)
    {

        if(n>0) {
            for (int i=0;i<n;i++) {
                System.out.print("*");
            }
            System.out.println();
            Pattern_rec(n-1);
        }
    }

    public static void main(String[] args) {
        Pattern_rec(4);
    }
}
