public class Fibonacci {
    static int search(int n)
    {
        if(n ==1)
        {
            return 0;
        }
        else if (n == 2)
        {
            return 1;
        }
        else {
            return search(n-1)+search(n-2);
        }
    }

    public static void main(String[] args) {
       int  a = search(2);
        System.out.println(a);


    }
}
