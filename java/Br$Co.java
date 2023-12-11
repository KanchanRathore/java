public class Br$Co {
    public static void main(String[] args) {
        int i = 0;
        for(i=0;i<=5;i++)
        {
            System.out.println("CAT");
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
            System.out.println("Super");
        }
        System.out.println("i only wants 3 times execution");
    }
}
