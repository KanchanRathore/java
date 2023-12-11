class Base1{
    Base1(){
        System.out.println("I am Parent");
    }
    Base1(int x){
        System.out.println("My Age is "+x);
    }

}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a DREived Class");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am a DErived Constructor with age " + x +"and"+ y );
    }

}
 class CHild extends Derived1{
    CHild(){
        System.out.println("I am a CHild");
    }
    CHild(int x,int y, int z)
    {
        super(x,y);
        System.out.println("the values"+x +y +z);
    }

 }


public class ConstructorWithInheritance {
    public static void main(String[] args)
    {
      // Base1 b = new Base1();
      CHild ch = new CHild(45,67,89);
    }}

