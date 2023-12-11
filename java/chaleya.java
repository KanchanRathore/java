class ISPrime {
    public ISPrime(int n) {
        int i, j;
        int count = 0;
        for (i = 1; i <= n; i++) {
            for (j = 2; j <=i; j++) {
                if (i % j != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
public class chaleya {
    public static void main(String[] args) {
        ISPrime pm = new ISPrime(6);

    }
}

