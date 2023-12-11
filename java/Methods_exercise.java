public class Methods_exercise {

    /*static void Multiplicaion(int n)
    {
        for(int i = 1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }

    public static void main(String[] args) {
        Multiplicaion(4);
    }*/
    /*static void Pattern(int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<=n-i-1;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Pattern(4);

    }*?
    /*static int Sum(int n)
    {
        if(n ==1)
        {
            return 1;
        }
        else {
            return n+Sum(n-1);
        }
    }

    public static void main(String[] args) {
        int a = Sum(5);
        System.out.println(a);

    }*/
    static float Average(float...arr)
    {
        float sum = 0;
        int i = 0;
        for(float a:arr)
        {
            sum += a;
            i++;
        }
        if(i!=0) {
            return sum / i;
        }
        else {
            return 0;
        }

    }

    public static void main(String[] args) {
        float f = Average(34.7f,78,9f,78.2f,12.67f);
        System.out.println(f);
    }


}
