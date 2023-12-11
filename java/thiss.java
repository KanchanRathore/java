class CD{
   int a;
    public CD(int v)
    {
        this.a = v;
        System.out.println(a);
    }
}
class geo extends CD
{
    public geo(int K){
        super(K);
        System.out.println("I am a costructor");

    }
}
public class thiss {
    public static void main(String[] args) {
        CD c = new CD(7);
        geo g = new geo(8);



    }
}
