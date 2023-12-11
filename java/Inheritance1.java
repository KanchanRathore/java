class Base{
    int x;
     void setx(int x){
        this.x = x;
    }
    public int getx(){
        return x;
    }
}
    class Derived extends Base{
         int y;
         public void sety(int y){
             this.y = y;
         }
         public int gety(){
             return y;
         }

      }
public class Inheritance1 {
    public static void main(String[] args){
        Base b = new Base();
        b.setx(45);
        System.out.println(b.getx());
        Derived d = new Derived();
        d.sety(78);
        System.out.println(d.gety());

    }
}
