public class Var_args {
    static int sum(int x,int...ty) {
        int sum1 = x;
        for (int a : ty) {
             sum1 = sum1 + a;
        }
        return sum1;
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
        System.out.println(sum(1,3));
    }
}
