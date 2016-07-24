package il.stqa.ptf.sandbox;

/**
 * Created by vovka on 25.07.2016.
 */
public class MyFirstProgram {
  public static void main(String[] args) {
    Square s = new Square(5);

    Rectangle r=new Rectangle(4,6);

    hello("word");

    System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

  System.out.println("Площадь прямоугольника со стороной "+ r.a + " и " + r.b + " = " +r.area());
}

public static void hello (String somebode)
    {

      System.out.println("Hello,"+somebode + " !" );
    }


 // public static double area(Rectangle r){
  //  return r.a * r.b;
//  }
}




