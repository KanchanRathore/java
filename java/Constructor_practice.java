import java.util.Scanner;
/*class cylinder{
    private float height;
    private float radius;
    private float Volume;
    private float SurfaceARea;
    public cylinder(int radius,int height)
    {
        this.radius = radius;
        this.height = height;
    }

    public void Setterradius(float radius)
    {
       this.radius = radius;
    }
    public void Setterheight(float height)
    {
        this.height = height;
    }
    public float Getterradius()
    {
        return radius;

    }
    public float GetterHeight()
    {
        return height;
    }
    public double SEtterVolume()
    {
        return 3.14*radius*radius*height;
    }
    public double SEtterSurfaceArea()
    {
        return 32*3.14*radius*height+283.14*radius*radius;
    }
}*/
class Rectanglee
{
    private int length;
    private int breadth;
    public Rectanglee(int length,int  breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public Rectanglee()
    {
        this.length = 4;
        this.breadth = 9;
    }
    public int getter()
    {
        return length;
    }
    public int Getter()
    {
        return breadth;
    }
}
public class Constructor_practice {
    public static void main(String[] args)
    {
        Rectanglee cyl = new Rectanglee(3,7);
        /*System.out.println(cyl.Getterradius());
        System.out.println(cyl.GetterHeight());
        System.out.println(cyl.SEtterVolume());
        System.out.println(cyl.SEtterSurfaceArea());*/
        System.out.println(cyl.getter());
        System.out.println(cyl.Getter());

    }

}
