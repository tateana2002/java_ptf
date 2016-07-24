package il.stqa.ptf.sandbox;

/**
 * Created by vovka on 25.07.2016.
 */
public class MyFirstProgram {
  public static void main(String[] args) {
    hello("word");
    double len=5;
    System.out.println("Площадь квадрата со стороной "+len+ "="+area(len) );

  double a=4;
  double b=6;
  System.out.println("Площадь прямоугольника со стороной "+ a + " и " + b + " = " +area(a,b));
}

public static void hello (String somebode)
    {

      System.out.println("Hello,"+somebode + " !" );
    }
public static double area(double l){
  return l*l;}

  public static double area(double a,double b){
    return a*b;
  }
}




