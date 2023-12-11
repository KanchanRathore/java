

/*class Employee1{
    int Salary;
    String Name;
    public int GetSalary()
    {
        return  Salary;
    }
    public String Getname()
    {
        return Name;
    }
    public void Setname(String n)
    {
        Name = n;
    }

}
class rectangle{
    int length;
    int breadth;
    public int area()
    {
        return length*breadth;
    }
    public int perimeter() {
        return 2 * (length + breadth);
    }
    */
    class Tommy
    {
        public void Hit()
        {
            System.out.println("Hitting the enemy");
        }
        public void fire()
        {
            System.out.println("Firing");
        }

    }

public class Oops_Practice {
    public static void main(String[] args) {
       /*  rectangle r = new rectangle();
        r.length = 6;
        r.breadth = 12;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        */
        Tommy t = new Tommy();
       t.Hit();
        t.fire();

    }
}

