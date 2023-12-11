public class Recursion {
    static int factorial(int n)
    {
        if(n ==1 || n== 0)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
       int a = factorial(4);
        System.out.println(a);
    }
}
