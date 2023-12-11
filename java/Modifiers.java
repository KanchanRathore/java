class circle{
    private int radius;
    private int perimeter;
    private int area;
  public void Setradius(int r)
  {

      radius = r;
  }
  public int getradius()
  {
      return radius;
  }
  public void setperimetr(){

      perimeter = (int) (2*3.14*radius);
  }
  public int Getperimeter()
  {
      return perimeter;
  }
    public void setARea(){
       area  = (int) (3.14*radius*radius);
    }
    public int getArea(){
      return area;
    }

  }
public class Modifiers {
    public static void main(String[] args) {
        circle C = new circle();
        C.Setradius(78);
        System.out.println(C.getradius());
        C.setperimetr();
        System.out.println(C.Getperimeter());
        C.setARea();
        System.out.println(C.getArea());

    }
}
