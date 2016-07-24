package il.stqa.ptf.sandbox;
public class PointDemo {
  public static void main(String[] args){
    Point p1 = new Point(0,0);
    Point p2 = new Point(9,4);

    System.out.println("p1 = " + p1.x + " , " + p1.y);

    System.out.println("p2 = " + p2.x + " , " + p2.y);

    System.out.println("p1.distance(p2) = " + p1.distance(p2));

    System.out.println("p1.distance(10,25) = " + p1.distance(10,25));

  // distance= Math.sqrt(Math.sqrt(p1.x-p2.x)+Math.sqrt(p1.y-p2.y));

}
}